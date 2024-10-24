class Calculate{
 static int cube(int x){
 return x*x*x;
 
}
}

  class Cube{
  public static void main(String arg[])
  {
  int result=Calculate.cube(5);
  System.out.println(result);
  }
  
  }