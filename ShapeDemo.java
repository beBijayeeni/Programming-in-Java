import java.util.*;
abstract class Shape{
	double length, breadth, height;
	abstract void volume();
	abstract void surfaceArea();
}
class Cube extends Shape{
	void input(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of side: ");
		length = in.nextDouble();
	}
	void volume(){
		System.out.println("The volume is: "+(length*length*length));
	}
	void surfaceArea(){
		System.out.println("The surface area is: "+(6*length*length));
	}
}

class Cylinder extends Shape{
	void input(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of radius: ");
		length = in.nextDouble();
		System.out.println("Enter the value of height: ");
		height = in.nextDouble();
	}
	void volume(){
		System.out.printf("The volume is: %.2f\n",(3.14*length*length*height));
	}
	void surfaceArea(){
		System.out.printf("The surface area is: %.2f\n",((2*3.14*length*length)+(2*3.14*length*height)));
	}
}
class ShapeDemo{
	public static void main(String[] arg){
		Cube c = new Cube();
		System.out.println("For Cube");
		System.out.println("============");
		c.input();
		c.volume();
		c.surfaceArea();
		Cylinder cy = new Cylinder();
		System.out.println("For Cylinder");
		System.out.println("===============");
		cy.input();
		cy.volume();
		cy.surfaceArea();
	}
}