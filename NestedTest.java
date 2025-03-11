class Nested{
	int a = 10;
	/*static class B{
		int b = 20;
		void show(){
			System.out.println("Hello");
		}
	}*/
	class B{
		int b = 20;
		void show(){
			System.out.println("Hello");
		}
	}
	//System.out.println("B ="+b);
}
class NestedTest{
	public static void main(String[] args){
		/*Nested.B obj = new Nested.B();
		obj.show();*/
		Nested.B obj = new Nested().new B();
		obj.show();
	}
}