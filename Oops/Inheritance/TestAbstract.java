abstract class Bike{
	abstract void run();
}

class Honda extends Bike{
	void run(){
	System.out.println("Running to honda bike");
	}
}
class TestAbstract{
	public static void main(String arg[]){
	Bike b1=new Honda();
	b1.run();
	}
}