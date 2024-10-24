class Student{
		int rollno;
		String name;
		String inst;
    Student(int rollno,String name,String inst)
	{
	this.rollno=rollno;
	this.name=name;
	this.inst=inst;
	}
	void display(){
	System.out.println("Student name  "+name+"  Age  "+rollno+"   Institute name  "+inst);
	}
}

class StudentInfo{
	public static void main(String arg[]){
	Student s1=new Student(14,"Ayush","Ideal");
	Student s2=new Student(24,"Deepu","LNCT");
	s1.display();
	s2.display();
	} 
}