import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();
        
        // Split the input string into words
        String[] words = input.split("\\s+");
        
        // Check if there are no words
        if (words.length == 0) {
            System.out.println("No words found.");
            return;
        }
        
        // Initialize variables to find the longest word
        String longestWord = words[0];
        
        // Iterate through words to find the longest
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        // Output the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}
