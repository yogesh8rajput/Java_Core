import java.util.*;
class AddSum
{
 public static int calculateSum(int a,int b){
 int sum=a+b;
 return sum;
 } 
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=calculateSum(a,b);
	System.out.println("Sum of two number:"+sum);
	
}
}