import java.util.Scanner;

public class Q22{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter coefficient a (for ax^2): ");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient b (for bx): ");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient c (constant): ");
        double c = scanner.nextDouble();

        

        // Check if 'a' is zero (not a quadratic equation)
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
        } else {
            // Calculate the discriminant (b^2 - 4ac)
            double discriminant = b * b - 4 * a * c;
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }
}
