import java.util.*;
class BinaryToDecimal {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
	  
	  int binaryNumber;
	  binaryNumber=sc.nextInt();
	  System.out.println("Enter the binaary number");
      int decimalNumber = 0;
      int base = 1;
      int temp = binaryNumber;
      while (temp > 0) {
         int lastDigit = temp % 10;
         temp = temp / 10;
         decimalNumber += lastDigit * base;
         base = base * 2;
      }
      System.out.println("Binary number: " + binaryNumber);
      System.out.println("Decimal number: " + decimalNumber);
   }
}