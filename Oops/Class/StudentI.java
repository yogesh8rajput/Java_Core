class Student{
  String name;
  int age;
  
  public void stdinfo(){
  System.out.println(this.name);
  System.out.println(this.age);
}
}

  class StudentI{
  public static void main(String arg[])
  {
    Student s1=new Student();
	s1.name="Ayush";
	s1.age=14;
	Student s2=new Student();
	s2.name="Deep";
	s2.age=20;
	s1.stdinfo();
	s2.stdinfo();
  }
  }