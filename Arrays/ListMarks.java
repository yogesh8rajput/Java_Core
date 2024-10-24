import java.util.*;
class ListMarks 
{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int size =sc.nextInt();	
	int n[]=new int[size];
	for(int i=0;i<size;i++){
	n[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	System.out.print("Your marks:"+n[i]+" ");
}
}