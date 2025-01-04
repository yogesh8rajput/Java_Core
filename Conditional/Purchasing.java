import java.util.*;

class Purchasing
   {
   public static void main(String arg[])
{
int puramt,dis,total;

dis=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your purchase amount");
puramt=sc.nextInt();
total=puramt;
if(puramt>=5000)
{
dis=(puramt*10)/100;
total=puramt-dis;

}
System.out.println("Purchase Amount : "+puramt);
System.out.println("Discount=- "+dis);
System.out.println("Total bill: "+total);



   
}
}
