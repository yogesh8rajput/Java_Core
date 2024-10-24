class Animal{
    String color="White";
	}

class Dog extends Animal{
   String color="Black";
   printColor(){
   System.out.println(color);
   System.out.pintln(super.color);
   }	
	}
class TestSuper2{
	public static void main(String arg[]){
	Dog d=new Dog();
	d.printColor();
	}
}