class Question2
{
	int i;
	public Question2(int i){
	  this.i=i--;
	}
}
class Question3 extends Question2{
	public Question3(int i){
	super(++i);
	System.out.println(i);
	}
}
public class Check{
		public static void main(String[] args)
		{
		Question3 n=new Question3(20);
		}
}