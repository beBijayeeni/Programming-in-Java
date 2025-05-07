import java.util.Scanner;

public class DigitReducer{
    public static int reduceToSingleDigitSum(int n) {
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
    public static int reduceToSingleDigitProduct(int n) {
        while (n > 9) {
            int product = 1;
            while (n != 0) {
                int digit = n % 10;
                if (digit != 0) {
                    product *= digit;
                }
                n /= 10;
            }
            n = product;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
		int sumResult = reduceToSingleDigitSum(number);
        int productResult = reduceToSingleDigitProduct(number);
		System.out.println("Single-digit sum: " + sumResult);
		System.out.println("Single-digit product (ignoring zeros): " + productResult);
    }
}

