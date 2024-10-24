import java.util.*;
class ListSearch//linear search 
{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int size =sc.nextInt();	
	int n[]=new int[size];
	for(int i=0;i<size;i++){
	n[i]=sc.nextInt();
	}
	int x=sc.nextInt();
	for(int i=0;i<n.length;i++){
	if(n[i]==x)
	{
	System.out.println("x number found:"+i);
}
}
}
}