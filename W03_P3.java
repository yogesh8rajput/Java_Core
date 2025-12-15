 import java.util.Scanner;
class W03_P3{
 public static long factorial(int x)
    {
        if (x >= 1)
            return x * factorial((x) -1;
        else
            return ;
    }
	public static void main(String[] args) {	
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.print(factorial(x));  

         System.out.print("factorial(x)");   
		//extra line of codes to next line 
  }
}
