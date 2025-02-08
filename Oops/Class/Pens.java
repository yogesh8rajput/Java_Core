class Pen{
String color;
String type;
   
	public void write(){
	System.out.println("Writing something");
	}  
		public void printcolor(){
		System.out.println(this.color);	
		}
}
 class Pens{
 public static void main(String arg[])
	{
	Pen p1=new Pen();
	p1.color="Blue";
	p1.type="Ball pens";
	//p1.write();
	Pen p2=new Pen();
	p2.color="black";
	p2.type="gel";
	p1.printcolor();
	p2.printcolor();
	} 
 }
