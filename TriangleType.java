import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first side of the triangle: ");
        int side1 = scanner.nextInt();
        
        System.out.print("Enter the second side of the triangle: ");
        int side2 = scanner.nextInt();
        
        System.out.print("Enter the third side of the triangle: ");
        int side3 = scanner.nextInt();
        
        
        if (isValidTriangle(side1, side2, side3)) {
            
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

        
        scanner.close();
    }

    
    public static boolean isValidTriangle(int side1, int side2, int side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
