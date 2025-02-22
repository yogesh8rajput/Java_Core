class Student{
  String name;
  int age;
  
  public void stdinfo(){
  System.out.println(this.name);
  System.out.println(this.age);
}
//non perameterised constructer
		Student(){
		System.out.println("Vidhya children higher Academy, Indore(M.P.)");
		}
}
  class StudentI{
  public static void main(String arg[])
  {

	  
    Student s1=new Student();
	s1.name="Ayush";
	s1.age=15;
	s1.stdinfo();
	Student s2=new Student();
	s2.name="Deepu";
	s2.age=21;
	
	s2.stdinfo();
  }
  }
