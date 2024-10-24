class Animal{
    Animal(){
	System.out.println("Animal class created");
	}
}
class Dog extends Animal{
    Dog(){
	super();
	{System.out.println("Dog class is created");}
	 
	}	
	}
class TestSuper3{
	public static void main(String arg[]){
	Dog d=new Dog();
	
	}
}