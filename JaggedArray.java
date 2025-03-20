import java.util.Scanner;

public class JaggedArray {
    private int[][] marks; // 2D jagged array to hold marks
    private String[] names; // Array to hold names of children
    
    // Constructor to allocate memory based on number of subjects for each child
    public JaggedArray() {
        marks = new int[5][]; // 5 children
        names = new String[5];
        
        // Allocate memory for each child based on number of subjects
        marks[0] = new int[3]; // Child 1 has 3 subjects
        marks[1] = new int[5]; // Child 2 has 5 subjects
        marks[2] = new int[2]; // Child 3 has 2 subjects
        marks[3] = new int[6]; // Child 4 has 6 subjects
        marks[4] = new int[4]; // Child 5 has 4 subjects
        
        // Initialize names array
        names[0] = "Child 1";
        names[1] = "Child 2";
        names[2] = "Child 3";
        names[3] = "Child 4";
        names[4] = "Child 5";
    }
    
    // Method to input marks for all children
    public  void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for " + names[i] + " (" + marks[i].length + " subjects):");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }
    
    // Method to display marks row-wise with child name
    public void displayMarks() {
        System.out.println("\n--- Marks of All Children ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Method to display total marks scored by each child
    public void displayTotalMarks() {
        System.out.println("\n--- Total Marks ---");
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println(names[i] + " - Total Marks: " + total);
        }
    }
    
    // Method to count marks more than 80 for each child
    public void countHighMarks() {
        System.out.println("\n--- Marks Above 80 ---");
        for (int i = 0; i < marks.length; i++) {
            int count = 0;
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > 80) {
                    count++;
                }
            }
            System.out.println(names[i] + " - Subjects with marks above 80: " + count);
        }
    }
    
    // Method to alert for marks less than 30
    public void alertLowMarks() {
        System.out.println("\n--- Alert: Marks Below 30 ---");
        boolean hasLowMarks = false;
        
        for (int i = 0; i < marks.length; i++) {
            boolean childHasLowMarks = false;
            
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 30) {
                    if (!childHasLowMarks) {
                        System.out.println(names[i] + " needs to improve in:");
                        childHasLowMarks = true;
                        hasLowMarks = true;
                    }
                    System.out.println("  Subject " + (j + 1) + ": " + marks[i][j]);
                }
            }
        }
        
        if (!hasLowMarks) {
            System.out.println("Congratulations! No one has marks below 30.");
        }
    }
    
    // Main method for testing
    public static void main(String[] args) {
        JaggedArray family = new JaggedArray();
        family.inputMarks();
        family.displayMarks();
        family.displayTotalMarks();
        family.countHighMarks();
        family.alertLowMarks();
    }
}