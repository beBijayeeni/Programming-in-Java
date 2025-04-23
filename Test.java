import java.util.*;
class MySet{
	int[] data;
	int n;
	MySet(int n){
		this.n = n;
		data = new int[n];
	}
	MySet(MySet obj1){
		this.n = n;
		data = new int[n];
	}
	void acceptSet(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements:");
		for (int i=0;i<n;i++){
			data[i] = sc.nextInt();
		}
	}
	void showSet(){
		System.out.println("The set is: ");
		for(int i=0;i<n;i++){
			System.out.println(data[i]+" ");
		}
	}
	MySet unionSet(Myset u){
		int[] temp;
		temp = new int[100];
		
		for (int i =0;i<this.m;i++){
			for (int j = 0;)
			
		}
	}
}

class Test{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the 1st array: ");
		int n = in.nextInt();
		MySet obj2 = new MySet(n);
		obj2.acceptSet();
		obj2.showSet();
		System.out.println("Enter the size of the 2nd array: ");
		int m = in.nextInt();
		
		MySet obj3 = new MySet(m);
		MySet obj4 = new MySet(obj3);
		obj3.acceptSet();
		obj3.showSet();
		
		MySet obj5 = new MySet(m+n);
		//MySet obj6 = new MySet(MySet obj5);
		obj5 = obj2.unionSet(obj3);
	}
}
