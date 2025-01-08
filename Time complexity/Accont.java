import java.util.*;
class Accountt{  
int acc_no;  
String name;  
float amount;  
//Method to initialize object  
void insert(int a,String n,float amt){  
acc_no=a;  
name=n;  
amount=amt;  
}  
//deposit method  
void deposit(float amt){
amt=sc.nextFloat();	
amount=amount+amt;
  
System.out.println(amt+" depositeded");
  
}  
//withdraw method  
void withdraw(float amt){  
if(amount<amt){  
System.out.println("Insufficient Balance");  
}else{  
amount=amount-amt;  
System.out.println(amt+" withdrawn");  
}  
}  
//method to check the balance of the account  
void checkBalance(){
	
System.out.println("Balance is: "+amount);}  
//method to display the values of an object  
void display(){System.out.println(acc_no+" "+name+" "+amount);}  
}  
//Creating a test class to deposit and withdraw amount  
class Accont{  
public static void main(String[] args){  
Accountt a1=new Accountt();  
a1.insert("Ankit");  
a1.display();  
a1.checkBalance();  
a1.deposit();  
a1.checkBalance();  
a1.withdraw();  
a1.checkBalance();  
}}   