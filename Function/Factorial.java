import java.util.*;

class Factorial
{
  public static void printFactorial(int n)
  {
 
  if(n<0)
  {
	  System.out.println("invalid");
	  return;
  }
   int factorial=1;
  for(int i=n;i>=1;i--){
  factorial=factorial*i;
  }
  System.out.println(factorial);
  return;
  }
  public static void main(String arg[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the one number");
  int n=sc.nextInt();
  printFactorial(n);
  }
}