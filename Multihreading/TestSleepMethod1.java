class TestSleepMethod1 extends Thread{    
 public void run(){    
  for(int i=1;i<9;i++){   
  // the thread will sleep for the 500 milli seconds   
    try
	{Thread.sleep(800);}
	catch(InterruptedException e)
	{System.out.println(e);}    
    System.out.println(i);    
  }    
 }    
 public static void main(String args[]){    
  TestSleepMethod1 t1=new TestSleepMethod1();    
  TestSleepMethod1 t2=new TestSleepMethod1(); 
TestSleepMethod1 t3=new TestSleepMethod1();      
     
  t1.start();    
  t2.start();
t3.start();    
 }    
}    
