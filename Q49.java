import java.util.*;
class MathUtil{
	static class Calculator{
		int a, b;
		Calculator(int a,int b){
			this.a = a;
			this.b = b;
			
		}
		static int add(int a, int b){
			return a+b;
		}
	}
}
class Q49{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers:");
		int a = in.nextInt();
		int b = in.nextInt();
		MathUtil.Calculator obj = new MathUtil.Calculator(a,b);
		int result = obj.add(a,b);
		System.out.println("The sum is: "+result);
	}
}