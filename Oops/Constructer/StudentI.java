class Student{
  String name;
  int age;
  
  public void stdinfo(){
  System.out.println(this.name);
  System.out.println(this.age);
}
//non perameterised constructer
		Student(){
		System.out.println("Vidhya children Academy");
		}
}
  class StudentI{
  public static void main(String arg[])
  {
    Student s1=new Student();
	s1.name="Ayush";
	s1.age=14;
	s1.stdinfo();
	Student s2=new Student();
	s2.name="Deep";
	s2.age=20;
	
	s2.stdinfo();
  }
  }