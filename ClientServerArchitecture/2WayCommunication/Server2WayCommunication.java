import java.net.*;
import java.io.*;
import java.util.*;

/**
 * A simple two-way command-line chat server.
 * It waits for a single client to connect and then facilitates a turn-based chat.
 */
class Server2WayCommunication {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private Scanner consoleScanner;

    /**
     * Constructor to initialize the server on a specific port.
     * @param port The port number to listen on.
     * @throws IOException If an I/O error occurs when opening the socket.
     */
    public Server2WayCommunication(int port) throws IOException {
        // 1. Initialize the ServerSocket.
        // Using a port number > 1024 is recommended to avoid needing special permissions.
        serverSocket = new ServerSocket(port);
        System.out.println("Server started. Waiting for a client to connect on port " + port + "...");
    }

    /**
     * Starts the chat session after a client connects.
     * Handles receiving messages from the client and sending messages from the server console.
     */
    public void startChat() throws IOException {
        try {
            // 2. Wait for a client to connect. This is a blocking call.
            clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostName());

            // 3. Set up I/O streams for communication with the connected client.
            // Using PrintWriter with auto-flush (true) is convenient for sending lines of text.
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            consoleScanner = new Scanner(System.in);

            String clientMessage;
            String serverMessage;

            // 4. Main communication loop. The server listens, then speaks.
            while (true) {
                // Wait for and read a message from the client.
                // This is a blocking call until the client sends a line.
                if ((clientMessage = in.readLine()) != null) {
                    System.out.println("Client says: " + clientMessage);
                    // If the client says "bye", print a message and break the loop.
                    if ("bye".equalsIgnoreCase(clientMessage)) {
                        System.out.println("Client has left the chat.");
                        break;
                    }
                }

                // Get a message from the server's console input.
                System.out.print("Server says: ");
                serverMessage = consoleScanner.nextLine();

                // Send the server's message to the client.
                out.println(serverMessage);

                // If the server says "bye", break the loop to end the session.
                if ("bye".equalsIgnoreCase(serverMessage)) {
                    System.out.println("Server is closing the chat.");
                    break;
                }
            }
        } finally {
            // 5. Clean up all resources in a finally block to ensure they are closed.
            System.out.println("Closing connection and shutting down server.");
            if (in != null) in.close();
            if (out != null) out.close();
            if (consoleScanner != null) consoleScanner.close();
            if (clientSocket != null) clientSocket.close();
            if (serverSocket != null) serverSocket.close();
        }
    }

    /**
     * The main method to run the server application.
     */
    public static void main(String[] args) {
        try {
            // Create a server instance on port 12345.
            Server2WayCommunication server = new Server2WayCommunication(12345);
            // Start the chat logic.
            server.startChat();
        } catch (IOException e) {
            // Handle potential errors during server setup or communication.
            System.err.println("An error occurred with the server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
