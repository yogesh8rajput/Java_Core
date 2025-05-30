class Instance

{
   public String name="hello";
   public int age=20;
   
  
}

class InstanceVariable2

{
   public static void main(String arg[])
   {
   Instance i=new Instance();
   
   
   System.out.println("Student Name:"+i.name);
   System.out.println("Student age:"+i.age);
   }
}