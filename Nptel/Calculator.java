public class Calculator{
   int num=10;
   public void calc(int num){
   this.num=num*10;
	   
   
   }
   public void printNum(){
   System.out.println(num);
   }
	public static void main(String arg[]){
		Calculator obj=new Calculator();
		obj.calc(2);
		obj.printNum();
	}
}
