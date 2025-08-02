import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 * A simple two-way command-line chat client.
 * Connects to the Server2WayCommunication server to start a chat.
 * This version corrects the logic to use a single, persistent connection.
 */
public class Client2WayCommunication {

    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private Scanner consoleScanner;

    /**
     * Constructor to initialize the client and connect to the server.
     * @param serverAddress The IP address or hostname of the server.
     * @param port The port number the server is listening on.
     * @throws IOException If an I/O error occurs when creating the connection.
     */
    public Client2WayCommunication(String serverAddress, int port) throws IOException {
        // 1. Establish a SINGLE connection to the server.
        System.out.println("Attempting to connect to server at " + serverAddress + ":" + port + "...");
        socket = new Socket(serverAddress, port);
        System.out.println("Successfully connected to the server.");

        // 2. Set up I/O streams that will be REUSED for the entire session.
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        consoleScanner = new Scanner(System.in);
    }

    /**
     * Starts the chat session using the established connection.
     * Handles sending messages to the server and receiving messages from it in a loop.
     */
    public void startChat() throws IOException {
        try {
            System.out.println("Chatting started. Type 'bye' to end.");
            String serverMessage;
            String clientMessage;

            // 3. Main communication loop. The client sends a message, then waits for a reply.
            while (true) {
                // Get a message from the client's console input.
                System.out.print("Client says: ");
                clientMessage = consoleScanner.nextLine();

                // Send the client's message to the server over the existing stream.
                out.println(clientMessage);

                // If the client says "bye", break the loop to end the session.
                if ("bye".equalsIgnoreCase(clientMessage)) {
                    System.out.println("Client is leaving the chat.");
                    break;
                }

                // Wait for and read a message from the server on the same stream.
                // This is a blocking call until the server sends a line.
                serverMessage = in.readLine();
                if (serverMessage != null) {
                    System.out.println("Server says: " + serverMessage);
                    // If the server says "bye", print a message and break the loop.
                    if ("bye".equalsIgnoreCase(serverMessage)) {
                         System.out.println("Server has closed the chat.");
                        break;
                    }
                } else {
                    // If readLine returns null, the server has closed the connection.
                    System.out.println("Server connection was lost.");
                    break;
                }
            }
        } finally {
            // 4. Clean up all resources in a finally block to ensure they are closed.
            System.out.println("Closing connection.");
            if (in != null) in.close();
            if (out != null) out.close();
            if (consoleScanner != null) consoleScanner.close();
            if (socket != null) socket.close();
        }
    }

    /**
     * The main method to run the client application.
     */
    public static void main(String[] args) {
        // Use "localhost" or the server's IP address passed from the command line.
        String serverAddress = "localhost";
        if (args.length > 0) {
            serverAddress = args[0];
        } else {
            System.out.println("No server address provided. Defaulting to 'localhost'.");
        }
        
        // The port must match the server's port.
        int port = 12345;

        try {
            Client2WayCommunication client = new Client2WayCommunication(serverAddress, port);
            client.startChat();
        } catch (IOException e) {
            System.err.println("Error connecting to the server: " + e.getMessage());
            System.err.println("Please make sure the server is running and the address/port are correct.");
        }
    }
}
