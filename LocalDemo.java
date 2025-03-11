class Outer{
	void show(){
		class Inner{
			void display(){
				System.out.println("Hello");
			}
		}
		Inner in = new Inner();
		in.display();
	}
}
class LocalDemo{
	public static void main(String[] arg){
		Outer o = new Outer();
		o.show();
		/*Inner in = new Inner();
		in.display();
		error: cannot find symbol
                Inner in = new Inner();
                               ^
  symbol:   class Inner
  location: class LocalDemo*/
	}
}