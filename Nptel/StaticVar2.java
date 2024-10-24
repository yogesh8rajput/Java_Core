class Cicle{
	static int circlecount=0;
	double x,y,r;
	public Cicle(double x, double y, double r){
		this.x=x;
		this.y=y;
		this.r=r;
	circlecount++;
	}
	public Cicle(double r){
		this(0.0,0.0,r);
		circlecount++;
	}
	public Cicle(Cicle c){
		this(c.x,c.y,c.r);
		circlecount++;
	}
	public Cicle(){
		this(0.0,0.0,0.1);
		//circlecount++;
	}
	public double circumference(){
		return(2*3.14*r);
	}
	public double area(){
		return(3.14*r*r);
	}
}

class StaticVar2{
	public static void main(String arg[]){
		Cicle c1 = new Cicle();
		Cicle c2 = new Cicle(5.0);
		Cicle c3 = new Cicle(c1);
		
		System.out.println("c1-"+c1.circlecount+" c2-"+c2.circlecount+" c3-"+c3.circlecount);
	}
}