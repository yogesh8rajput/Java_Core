import java.util.ArrayList;
import java.util.Collections;
class ArrayInteger
{
  public static void main(String arg[]){
   ArrayList<Integer> list=new ArrayList<>();
      list.add(8);
	  list.add(6);
	  list.add(0);
	  System.out.println(list);
	  //Get 
	  int element=list.get(0);
	   System.out.println(element);
	  //Add between
	  list.add(2,1);
	System.out.println(list);
		//set
		list.set(2,2);
		System.out.println(list);
       //Delete
	   list.remove(2);
	   System.out.println(list); 
	  //size of arraylist
		int size=list.size();
		 System.out.println(size);
		 //Sort list
	    Collections.sort(list);
		System.out.println(list);	
		 
	  
  
  }
}