class Q7
{
	public static void main(String args[])
	{
		int n=123,s=0,a;
		System.out.println("The original number is: "+n);
		while(n>0)
		{
			a=n%10;
			s=s*10+a;
			n=n/10;
		}
		System.out.println("The reversed number is= "+s);
	
		


	}
}