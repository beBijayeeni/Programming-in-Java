import java.util.*;
class Constants{
	static final double PI = 3.14159;
	static void calculateArea(int r){
		double area = PI*r*r;
		System.out.println("The area is: "+area);
	}
}
class Q44{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = in.nextInt();
		Constants.calculateArea(r);
	}
}