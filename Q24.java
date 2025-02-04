import java.util.Scanner;

public class Q24{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the term: ");
        int n = scanner.nextInt();
		int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + "th terms:");
        
        for (int i = 1; i <= n; i++) {
			System.out.println(first + " ");
            int next = first + second; 
            first = second; 
            second = next; 
        }
    }
}


