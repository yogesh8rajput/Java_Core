import java.util.*;

class Reverse
{
 public static void main(String arg[])
 {
   int num,a,s=0;
  
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter Number: ");
   num=sc.nextInt();
   while(num !=0)
   {
   a=num%10;
   
   s=s*10+a;
   num=num/10;
   }
   System.out.println("Revrse: "+s);
 }
}