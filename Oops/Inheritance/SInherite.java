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

class SInherite{
    public static void main(String arg[])
	{
	Triangle t1=new Triangle();
	t1.area(18,4);
	}
}
