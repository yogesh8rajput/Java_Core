 class Employe{
	 String name;
	 int age;
 public void info(String name){
 System.out.println(name);
 }
 public void info(int age){
 System.out.println(age);
 }
 public void info(String name,int age){
 System.out.println(name+" "+age);
 }
 }
 class Employes{
 public static void main(String arg[])
 {
 Employe e1=new Employe();
 e1.name="aman";
 e1.age=24;
 e1.info(e1.name,e1.age);
 }
 }
 