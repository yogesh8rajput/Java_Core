import java.util.*;

class AreaC
{
public static void main(String arg[])
{
   int r;
   float ar;
   
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the radius");
   r=sc.nextInt();
   ar=3.14f*r*r;
   System.out.println("Area of circle:-"+ar);
}
}