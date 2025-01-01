
class Circle{
	double x,y;
	double r;


	public double cercum(){
	return 2*3.14*r;
	}
	 public double area(){
	return (22/7)*r*r;
	
	}
}
	
	class Circleee{
	public static void main(String arg[])
	{
	Circle c=new Circle();
	c.x=0;
	c.y=0;
	c.r=2;
	System.out.println("Circumference: "+c.cercum());
	System.out.println("Area: "+c.area());
	}
	}
