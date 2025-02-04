import java.util.Scanner;

public class Q23{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		int a, s=0;

        
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
		int temp=n;
		while(n>0)
		{
			a=n%10;
			s=s*10+a;
			n=n/10;
		}
		if(s==temp)
			System.out.println("The number is palindrome.");
		else
			System.out.println("The number is not palindrome.");
    }
}
