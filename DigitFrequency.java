import java.util.Scanner;
class DigitFrequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        int[] digitFrequency = new int[10];
        if (number == 0) {
            digitFrequency[0] = 1;
        } else {
            int tempNumber = number;
            while (tempNumber > 0) {
                int digit = tempNumber % 10;
                digitFrequency[digit]++;
                tempNumber /= 10;
            }
        }


        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] > 0) {
                System.out.println("Digit " + i + ": " + digitFrequency[i]);
            }
        }
    }
}