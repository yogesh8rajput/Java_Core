
class Multi2 implements Runnable
{
 public void run()
 {
 System.out.println("Thread in running"); }


	public static void main(String arg[]){
	Multi m1=new Multi();
	Thread t1=new Thread(m1);
	m1.start();
	}
	}