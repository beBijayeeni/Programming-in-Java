import java.util.*;
interface IntOperations{
	void chkPositivity(int n);
	void chkEvenOdd(int n);
	void isPrime(int n);
	void isPalindrome(int n);
	void factorial(int n);
	void sumOfDigits(int n);
}
class MyNumber implements IntOperations{
	private int num;
	MyNumber(){
		num = 0;
	}
	MyNumber(int num){
		this.num = num;
	}
	public int getPrivateData() {
        return num;
    }
	public void setPrivateData(int num) {
        this.num = num;
    }
	public void chkPositivity(int num){
		if(num>=0)
			System.out.println("The number is positive");
		else
			System.out.println("The number is negative");
	}
	public void chkEvenOdd(int num){
		if(num%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}
	public void isPrime(int num){
		int c = 0;
		for(i=2;i<=n;i++){
			if(i%n==0)
				c++;
		}
		if(c==2)
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
	}
	public void isPalindrome(int num){
		int a, s = 0;
		int temp = num;
		while(num>0){
			a = num%10;
			s=s*10+a;
			num=num/10;
		}
		if(temp==s)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
	}
	public void factorial(int num){
		int fact = 1;
		for(i=num;i>=1;i--){
			fact = fact*i;
		}
		System.out.println("The factorial is: "+fact);
	}
	public void sumOfDigits(int num){
		int a, s = 0;
		while(num>0){
			a = num%10;
			s=s+a;
			num=num/10;
		}
		System.out.println("The sum of digits is: "+s);
	}
}
class MyNumberDemo{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any integer: ");
		int num = in.nextInt();
		MyNumber obj = new MyNumber();
		MyNumber.setPrivateData(num);
		System.out.println("Enter your choice:");
		System.out.println("1.Check Positivity\n2.Check Even or Odd\n3.Check Prime\n4.Check Palindrome\n5.Find Factorial\n6.Find Sum of Digits");
		int choice;
		switch(choice){
			case 1:
				
		}
	}
}