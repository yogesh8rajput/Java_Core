public class Question extends Thread{
   public void run(){
   for(int i=1;i<8;i++){
   System.out.print(++i +" ");
   }
   }
   public static void main(String arg[])
   {
   Question a=new Question();
   a.run();
   }
}