
class Multi extends Thread
{
 public void run()
 {
 System.out.println("Thread in running in"); }


	public static void main(String arg[]){
	Multi m1=new Multi();
	m1.start();
	}
	}
