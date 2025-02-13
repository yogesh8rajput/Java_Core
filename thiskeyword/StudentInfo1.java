class Student1{
		int rollno;
		String name;
		String inst;
    Student1(int r,String n,String i)
	{
	rollno=r;
	name=n;
	inst=i;
	}
	void display(){
	System.out.println("Student name  "+name+"  Age  "+rollno+"   Institute name  "+inst);
	}
}

class StudentInfo1{
	public static void main(String arg[]){
	Student1 s1=new Student1(14,"Ayush","Ideal");
		
	Student1 s2=new Student1(24,"Deepu","LNCT");
	s1.display();
	s2.display();
	} 
}
