class Outer{
	static public int a = 10;
	static int b = 20;
	private static int c = 30;
	static class Inner{
		void show(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
}
class OuterDemo{
	public static void main(String arg[]){
		Outer.Inner obj = new Outer.Inner();
		obj.show();
	}
}