import java.util.*;

class EvenN
{
  public static void main(String arg[])
  {
  int num;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  num=sc.nextInt();
  if(num%2==0)
  {
    System.out.println("Enen Number");
  }
  else{
    System.out.println("Odd Number");
  }
  }

}