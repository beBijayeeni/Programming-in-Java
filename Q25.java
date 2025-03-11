import java.util.Scanner;
class Q25 {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start of the range");
        int start = scanner.nextInt(); 
		System.out.println("Enter the end of the range");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    
    static boolean isPrime(int num) {
        if (num < 2) return false; 
        
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}