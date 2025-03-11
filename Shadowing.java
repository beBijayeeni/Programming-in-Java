/*class Outer{
	public int x = 10;
	class Inner{
		public int x = 20;
		void show(int x){
			System.out.println("X="+x);
			System.out.println("Inner X="+x);
			System.out.println("Outer X="+x);
		}
	}
}
class Shadowing{
	public static void main(String[] arg){
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.show(23);
	}
}*/
class Outer{
	public int x = 10;
	class Inner{
		public int x = 20;
		void show(int x){
			System.out.println("X="+x);
			System.out.println("Inner X="+this.x);
			System.out.println("Outer X="+Outer.this.x);
		}
	}
}
class Shadowing{
	public static void main(String[] arg){
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.show(23);
	}
}