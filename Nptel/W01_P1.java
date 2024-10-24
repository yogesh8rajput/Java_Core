import java.util.Scanner;
public class W01_P1 { 
   public static void main(String[] strings) {
       double width ;
       double height;
       double per,area;
	   
       Scanner in = new Scanner(System.in);
       width = in.nextDouble();
       height = in.nextDouble();
	   per=2*(width+height);
	   area=width*height;
	   System.out.println("Perimeter"+per);
	   System.out.println("Area"+area);

      
   }
}