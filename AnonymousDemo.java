abstract class A{
	abstract void show();
}
public class AnonymousDemo{
	public static void main(String arg[]){
		A obj = new A(){
			public void show(){
				System.out.println("in anonymous show");
			}
		};
		obj.show();
	}
}