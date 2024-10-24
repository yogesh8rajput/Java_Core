class Shape{
  public void area()
   {
	   System.out.println("Dispaly area");
   }
}
class Triangle extends Shape{
	public void area(int l,int h)
   {
	   System.out.println(l*h*1/2);
   }
}
class Circle extends Triangle{
	public void area(int r)
   {
	   System.out.println((3.14)*r*r);
   }
}

class Area{
    public static void main(String arg[])
	{
	Triangle t1=new Triangle();
	t1.area(8,4);
	Circle t2=new Circle();
	t2.area(4);
	}
}