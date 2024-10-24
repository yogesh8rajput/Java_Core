class A{
	
	void m(){
	System.out.println("hello m function");
	
	}
	void n(){
		this.m();
	System.out.println("hello n function");
	//this.m();
	}
}
class MN{
  public static void main(String arg[]){
  A a=new A();
  a.n();
  }
}