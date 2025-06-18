public class WrapperDemo{
	public static void main(String arg[]){
		int num1 = 7;
		System.out.println(num1);
		//Integer num2 = new Integer(8); deprecated and marked for removal
		Integer num2 = 8;
		num2 = num1; //auto-boxing
		int num3 = num2.intValue(); //unboxing
		int num4 = num2; //auto-unboxing
		System.out.println(num2);
		String str = "12";
		int num5 = Integer.parseInt(str);
		System.out.println(num5*2);
	}
}