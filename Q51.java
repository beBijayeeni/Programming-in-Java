import java.util.*;
class UserString{
	String str;
	UserString(String str){
		this.str = str;
	}
	void count(){
		System.out.println("No. of all the characters: "+str.length());
	}
}
class Q51{
	public static void main(String[] arg){
		UserString obj = new UserString("This is java class.")
		obj.count();
	}
}