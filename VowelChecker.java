import java.util.Scanner;
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
public class VowelChecker {
    public static void checkStringForVowels(String inputString) throws NoVowelsException {
        boolean containsVowel = false;
        String lowerCaseString = inputString.toLowerCase();
        for (int i = 0; i < lowerCaseString.length(); i++) {
            char ch = lowerCaseString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                containsVowel = true;
                break;
            }
        }
        if (!containsVowel) {
            throw new NoVowelsException("The string '" + inputString + "' does not contain any vowels.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        try {
            checkStringForVowels(userInput);
            System.out.println("The string contains vowels.");

        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
