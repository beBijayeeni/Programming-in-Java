import java.util.*;
class happy
{
    public static void main(String[]Args)
    {
        Scanner sc=new Scanner(System.in);
        int s=0 , d, n, m1 ;
        System.out.println("Import Number");
        n=sc.nextInt();
        m1=n;
        while(m1>0)
         {
             d=m1%10;
             s+=d*d;
             m1/=10;
             if(m1==0 && s>9)
             {
                 m1=s;
                 s=0;
             }
         }
         if(s==1)
         System.out.println(n + " is a happy number ");
         else
         System.out.println(n + " is not a happy number");
	}
}