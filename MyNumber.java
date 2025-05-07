import java.util.Scanner;
interface IntOperations {
    boolean isPositive();
    boolean isNegative();
    boolean isEven();
    boolean isOdd();
    boolean isPrime();
    boolean isPalindrome();
    int factorial();
    int sumOfDigits();
}
class MyNumber implements IntOperations {
    private int value;
    public MyNumber() {
        this.value = 0;
    }
    public MyNumber(int value) {
        this.value = value;
    }
    public boolean isPositive() {
        return value > 0;
    }
    public boolean isNegative() {
        return value < 0;
    }
    public boolean isEven() {
        return value % 2 == 0;
    }
    public boolean isOdd() {
        return value % 2 != 0;
    }
    public boolean isPrime() {
        int n = Math.abs(value);
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public boolean isPalindrome() {
        int n = Math.abs(value), rev = 0, orig = n;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev == orig;
    }
    public int factorial() {
        int n = value;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public int sumOfDigits() {
        int n = Math.abs(value), sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = sc.nextInt();
		MyNumber num = new MyNumber(n);
		while(true){
			System.out.println("\nCurrent value: " + num.getValue());
			System.out.println("1. Check positive/negative");
			System.out.println("2. Check even/odd");
			System.out.println("3. Check prime");
			System.out.println("4. Check palindrome");
			System.out.println("5. Compute factorial");
			System.out.println("6. Sum of digits");
			System.out.println("7. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println(num.isPositive()?"Positive":num.isNegative()?"Negative":"Zero");
					break;
				case 2:
					System.out.println(num.isEven()?"Even":"Odd");
					break;
				case 3:
					System.out.println(num.isPrime()?"Prime":"Not prime");
				case 4:
					System.out.println(num.isPrime()?"Palindrome":"Not Palindrome");
					break;
				case 5:
					int f = num.factorial();
					System.out.println("Factorial: "+f);
					break;
				case 6:
					System.out.println("Sum of digits: " + num.sumOfDigits());
					break;
				 case 7:
					sc.close();
					return;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}	