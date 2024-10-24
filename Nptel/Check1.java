class Question {
	static int x;
	static {
		x++;
	}
	{
	 ++x;
	}
}
class Question1 extends Question{
	static {
		--x;
	}
	{
	  x--;
	}
}
public class Check1{
	public static void main(String arg[]){
	  System.out.println(new Question1().x);
	}
		}