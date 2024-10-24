
class Strings2{
public static void main(String arg[]){
    String name="Tony";
	String last="Stark";	
    String fulname=name+" "+last;
	   System.out.println("Your name:"+fulname);
	   System.out.println("Length:"+fulname.length());
	   //charAt single element print
	   for(int i=0;i<fulname.length(); i++){
		   System.out.println(fulname.charAt(i));
		   
	   }
}
}