class Initializer{
	static int initialValue;
	static{
		initialValue = 1000;
	}
	static void print(){
		System.out.println("The initial value is:"+initialValue);
	}
}
class Q42{
	public static void main(String[] arg){
		Initializer.print();
		Initializer obj = new Initializer();
		Initializer.print();
	}
}