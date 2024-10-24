import java.util.*;
class Student{
	
	 private String name;
   // private String breed;
    private int age;
	
	public void getAge(){
		
		this.age=age;
	}
	public void getName(){
		
		this.name=name;
	}
	  
}


class W02_P2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read input
    // System.out.print("Enter name: ");
    String name = scanner.nextLine();
    // System.out.print("Enter age: ");
    int age = scanner.nextInt();

    // Create Student object
    Student student = new Student(name, age);

    // Print student details
    System.out.println("Student Name: " + student.getName());
    System.out.println("Student Age: " + student.getAge());

    scanner.close();
  }
}