class Shape{
  public void area()
   {
	   System.out.println("Dispaly area:");
   }
}
class Triangle extends Shape{
	public void area(int l,int h)
   {
	   System.out.println(l*h*1/2);
   }
}
class Triangle2 extends Triangle{
	public void area(int l,int h)
   {
	   System.out.println(l*h*1/2);

	   
   }
}

class MInherit{
    public static void main(String arg[])
	{
	Triangle t1=new Triangle();
	t1.area(9,9);
	Triangle2 t2=new Triangle2();
	t2.area(9,8);
	}
}
