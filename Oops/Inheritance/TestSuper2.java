class Animal{
    void eat(){
	System.out.println("Eating to milk");
	}
}
class Dog extends Animal{
    void eat(){System.out.println("Biscuit");}
	 void bark(){System.out.println("Barking");}
    void work(){
	  super.eat();
	  eat();
	  bark();
	}	
	}
class TestSuper2{
	public static void main(String arg[]){
	Dog d=new Dog();
	d.work();
	}
}