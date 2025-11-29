import java.util.*;
class Greater
{
    public static void main(String arg [])
    {
       int a;
       int b;
       Scanner sc=new Scanner(System.in);
      
      
System.out.println("Type value if A:");
 a=sc.nextInt();
System.out.println("Type value if B:");
 b=sc.nextInt();
     if(a == b)
     
        System.out.println("equal");

     
     else if(a>b)
     
        System.out.println("A is greater");

     
     else
     
        System.out.println("B is greater");

     
   }
       
}