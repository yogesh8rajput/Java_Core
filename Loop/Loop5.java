import java.util.*;

class Loop5
{
   public static void main(String arg[])
   {
   int n,sum=0;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for( int i=1;i<=n;i++)
   {
   sum=sum+i;
   }
   System.out.println(sum);
   
   }
}