import java.io.*;    
 class Employee implements Serializable  
{    
int empid;    
String empname;    
public Employee(int empid, String empname)   
{    
this.empid = empid;    
this.empname = empname;    
}    
}  

class SerializationExample   
{    
public static void main(String args[])  
{    
try  
{    
//Creating the object    
Employee emp = new Employee(198054,"Andrew");    
//Creates a stream and writes the object    
FileOutputStream fout=new FileOutputStream("employee.txt");    
ObjectOutputStream out=new ObjectOutputStream(fout);    
out.writeObject(emp);    
out.flush();    
//closes the output stream    
out.close();    
System.out.println("Successfully Created");    
}  
catch(Exception e)  
{  
System.out.println(e);  
}    
}    
}    