import java.util.*;

class Swapping
{
  public static void main(String arg[])
  {
  int a,b;
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:-");
   a=sc.nextInt();   
   System.out.println("Enter b number:-");
   b=sc.nextInt();
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("Value of a:-"+a);
   System.out.println("Value of b:-"+b);
   
    
  }
}