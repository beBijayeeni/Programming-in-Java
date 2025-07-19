/*
error: reference to m1 is ambiguous
                t.m1(20,20);
                 ^
  both method m1(int,float) in Test and method m1(float,int) in Test match
*/  
class Test{
	public void m1(int i,float f){
		System.out.println("int float method");
	}
	public void m1(float f, int i){
		System.out.println("float int method");
	}
	public static void main(String[]args){
		Test t = new Test();
		t.m1(20,20);
	}
}