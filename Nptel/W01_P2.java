import java.util.Scanner;
public class W01_P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        //System.out.print("Input an integer: ");

        // Read the integer from the user
        long n = input.nextLong();
         
        // Calculate and display the sum of the digits
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }