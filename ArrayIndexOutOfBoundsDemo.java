import java.util.*;
class ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
        int n = in.nextInt(); // Define the size of the array
        int[] myArray = new int[n]; // Declare and create an integer array of size n

        // Set some values in the array within the valid index range (0 to n-1)
        System.out.println("Enter "+n+" numbers: ");
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }

        System.out.println("\nAttempting to access an index out of bounds...");

        try {
            System.out.print("Enter the index you want to access (0 to " + (n - 1) + "): ");
            int indexToAccess = in.nextInt(); // Read the index from user input

            // Attempt to access the array using the user-provided index
            // If indexToAccess is less than 0 or greater than or equal to n,
            // an ArrayIndexOutOfBoundsException will occur here.
            int value = myArray[indexToAccess];

            // This line will only be reached if the index was valid
            System.out.println("Value at index " + indexToAccess + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the specific exception and print a message
            System.out.println("Caught an exception:");
            System.out.println(e.getMessage()); // Print the exception message
            System.out.println("This happened because you tried to access an index that is outside the valid range of the array.");
        }

        System.out.println("\nProgram finished.");
    }
}