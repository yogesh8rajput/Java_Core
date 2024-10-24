interface X{
		void display();
}
class Y implements X{
		public void display(){
		System.out.println("java");
		}
}
public class MainClass1{
		public static void main(String arg[])
		{
		Y r=new Y();
		r.display();
		}
}