import java.util.*;
class Gym{
	
	static int calculate(int arr[], int E){
		Arrays.sort(arr);
		int count = 0;
		for(int i=arr.length-1;i>=0;i--){
			for(int j=0;j<2;j++){
				E -= arr[i];
				count++;
				if(E<=0)
					return count;
			}
		}
		return -1;
	}
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
		}
		
		System.out.println(calculate(A, E));
	}
}