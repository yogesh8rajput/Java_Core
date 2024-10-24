import java.util.*;

class Studentinfo
{
  public static void main(String arg[])
  {
  String name;
  int rollno;
  float per;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter name:-");
  name=sc.next();
  System.out.println("Enter RollNo:-");
  rollno=sc.nextInt();
  System.out.println("Enter Persentage:-");
  per=sc.nextFloat();
   System.out.println("Student Name:-"+name);
   System.out.println("RollNo:-"+rollno);
   System.out.println("Persentage:-"+per);
   }
}