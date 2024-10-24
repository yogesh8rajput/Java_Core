import java.util.Scanner;

public class LongWord {
	public static Steing findongestWord(Steing text){
  String[] words input.split("\\W+");
  int longestWord.length=0;
  String longestWord="Believe in yourself";
  for(String word:words){
    if (word.length()>longestWord.length){
    longestWord=word;
      longestWord.length=word.length();
    }
    //return longestWprd;
  
}
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter text
       // System.out.println("Enter some text:");
        String text = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the method to find the longest word
        String longestWord = findLongestWord(text);

        // Print the longest word found
        System.out.print("The longest word in the text is: " + longestWord);
    }
}
  