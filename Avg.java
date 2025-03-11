class Avg{
	public static void main(String arg[])
	{
		int i, s=0, arr[];
		arr = new int[5];
		for(i=0;i<5;i++){
			arr[i]=Integer.parseInt(arg[i]);
			s+=arr[i];
		}
		float avg=(float)s/5;
		System.out.println("The result is: "+avg);
	}
}