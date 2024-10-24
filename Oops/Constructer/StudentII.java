class Studentt{
  String name;
  int age;
  
  public void stdinfo(){
  System.out.println(this.name);
  System.out.println(this.age);
}
//perameterised constructer
		Studentt(String name,int age){
		this.name=name;
		this.age=age;
		}
}
  class StudentII{
  public static void main(String arg[])
  {
    Studentt s1=new Studentt("Satish",24);
	Studentt s2=new Studentt("Pillu",21);
	s1.stdinfo();
	s2.stdinfo();
  }
  }