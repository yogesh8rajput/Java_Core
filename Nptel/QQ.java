class Q{
	public void disp(){
	System.out.println("java");
	}
}
class P extends Q{
	public void disp(){
	System.out.println("nptel");
}
}
class C extends P{
	public void disp(){
	super.disp();
	System.out.println("Course");
}
}
  public class QQ{
	public static void main(String arg[]){
	C c=new C();
	c.disp();
	}
  }