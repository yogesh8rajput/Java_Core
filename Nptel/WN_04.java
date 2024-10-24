import java.util.ArrayList;
import java.util.Scanner;

public class WN_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        
        if (!numbers.isEmpty()) {
            // Calculate average
            double sum = 0;
            int product = 1;
            for (int num : numbers) {
                sum += num;
                product *= num;
            }
            double average = sum / numbers.size();
            
            // Output results
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Product: " + product);
        } else {
            System.out.println("No numbers were entered.");
        }
        
        scanner.close();
    }
}
