final class Bike{}

class Honda extends Bike{
	void run(){
	System.out.println("Running to honda bike");
	}
}  ///compile time error
class TestFinal{
	public static void main(String arg[]){
	Honda b1=new Honda();
	b1.run();
	}
}