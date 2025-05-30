class Instance

{
   public String name;
   public int age=20;
   
   public Instance() 
   {
   this.name="Ayush";
   
   }
   }
  

class InstanceVariable

{
   public static void main(String arg[])
   {
   Instance i=new Instance();
   
   
   System.out.println("Student Name:"+i.name);
   System.out.println("Student age:"+i.age);
   }
}