class Q8
{
	
	public static void main(String args[])
	{
		float i,j;
		float sum=0;
		for(i=1;i<=7;i++)
		{
			float fact=1;
			for(j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			sum=sum+(i/fact);
		}
		System.out.println(sum);
	
		


	}
}
