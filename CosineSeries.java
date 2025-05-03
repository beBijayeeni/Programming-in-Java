import java.util.Scanner;

class CosineSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x (in radians): "); // Prompt for x
        double x = 0;

        // Input validation for x
        while (true) {
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number for x.");
                scanner.next(); // Consume invalid input
                System.out.print("Enter the value of x (in radians): ");
            }
        }

        System.out.print("Enter the number of terms for the series: "); // Prompt for number of terms
        int numberOfTerms = 0;

        // Input validation for number of terms
        while (true) {
            if (scanner.hasNextInt()) {
                numberOfTerms = scanner.nextInt();
                if (numberOfTerms > 0) {
                    break;
                } else {
                    System.out.println("Number of terms must be positive. Please enter a valid number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer for the number of terms.");
                scanner.next(); // Consume invalid input
            }
            System.out.print("Enter the number of terms for the series: ");
        }


        double result = calculateCosineSeries(x, numberOfTerms); // Calculate the series

        System.out.println("\nApproximation of cos(" + x + ") using " + numberOfTerms + " terms: " + result);

        scanner.close(); // Close the scanner
    }

    /**
     * Calculates the cosine series approximation for a given x and number of terms.
     * cos(x) = 1 - x^2/2! + x^4/4! - x^6/6! + ...
     * @param x The value of x in radians.
     * @param numberOfTerms The number of terms to include in the series.
     * @return The approximated value of cos(x).
     */
    public static double calculateCosineSeries(double x, int numberOfTerms) {
        double sum = 0;
        int sign = 1; // To alternate between positive and negative terms

        for (int i = 0; i < numberOfTerms; i++) {
            // The power and factorial are for even numbers: 0, 2, 4, 6, ...
            int power = 2 * i;
            double term = power(x, power) / factorial(power);
            sum += sign * term;
            sign *= -1; // Change sign for the next term
        }

        return sum;
    }

    /**
     * Calculates the factorial of a non-negative integer.
     * @param n The non-negative integer.
     * @return The factorial of n.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates x raised to the power of n.
     * @param x The base.
     * @param n The exponent.
     * @return x raised to the power of n.
     */
    public static double power(double x, int n) {
        if (n < 0) {
            // Handle negative exponents if needed, but for this series, exponents are non-negative.
             throw new IllegalArgumentException("Power is not defined for negative exponents in this context");
        }
        if (n == 0) {
            return 1;
        }
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
