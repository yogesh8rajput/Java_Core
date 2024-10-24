import java.util.*;
class Product
{
 public static int calculateProduct(int a,int b){
 int product=a*b;
 return product;
 } 
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int product=calculateProduct(a,b);
	System.out.println("Product of two number:"+product);
	
}
}