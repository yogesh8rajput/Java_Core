import java.util.Scanner;

public class W01_P3 {

  public static void main(String[] args)

  {
    int i,n, sum = 0;
      Scanner in = new Scanner(System.in);
     System.out.print("Input number: ");
	 
      n = in.nextInt();
	   for(i=1; i<=n;i++)
	  {
	  sum=sum+i;
	  }
            System.out.println("The sum of natural numbers is "+sum);
}}