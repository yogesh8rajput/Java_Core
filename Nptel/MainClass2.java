class X{
		static {
		Y.display();
		}
}
class Y extends X{
		static void display(){
		System.out.println("java");
		}
}
public class MainClass2{
   public static void main(String arg[])
{
		Y.display();
}   
}