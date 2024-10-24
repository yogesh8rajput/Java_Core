import java.util.ArrayList;
import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter an integer (or press 'q' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }
        
        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
        } else {
            // Calculate average
            double sum = 0;
            int product = 1;
            for (int num : numbers) {
                sum += num;
                product *= num;
            }
            double average = sum / numbers.size();
            
            System.out.printf("Average of all numbers: %.2f%n", average);
            System.out.printf("Product of all numbers: %d%n", product);
        }
        
        scanner.close();
    }
}
