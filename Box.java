import java.util.Scanner;
class Box{
	int l,b,h,v;
	Box(){
		l=0;
		b=0;
		h=0;
	}
	void PrintDim(){
		System.out.println("The length is: "+l);
		System.out.println("The breadth is: "+b);
		System.out.println("The height is: "+h);
	}
	int FindVolume(){
		v=l*b*h;
		return v;
	}
}
class Demo{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length, breadth, height consecutively: ");
        int l = scanner.nextInt();
		int b = scanner.nextInt();
		int h = scanner.nextInt();


		Box b1=new Box();
		int v;
		//b1.AssignDim(10,20,30);
		b1.PrintDim();
		v=b1.FindVolume();
		System.out.println("The volume is: "+v);
		
	}
}