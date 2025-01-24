class A{
	
	void m(){
	System.out.println("Hello, This is m function.");
	
	}
	void n(){
		this.m();
	System.out.println("Hello,This is n function.");
	//this.m();
	}
}
class MN{
  public static void main(String arg[]){
  A a=new A();
  a.n();
  }
}
