import java.util.*;
class Student 
{
   private String name;
   private int age;
	
	public Student(String name , int age){
	 this.name = name;
	 this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
class Stu{
    public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		
	Student st=new Student(name ,age);
	
	System.out.println(st.getName());
	System.out.println(st.getAge());
	}
}