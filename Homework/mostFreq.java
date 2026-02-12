import java.util.Scanner;

public class mostFreq {

    public static void main(String[] args) {

        // Tell the user what the program does
        System.out.println("This program finds the most frequently occurring character(s)");
        System.out.println("in a string of lowercase letters.");
        System.out.println();

        // Create a scanner to read input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string of lowercase letters: ");
        String text = input.nextLine();

        // Create an array to count each letter (a to z)
        int[] counts = new int[26];

        // Count how many times each character appears
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            counts[letter - 'a']++;
        }

        // Find the highest frequency
        int maxCount = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
            }
        }

        // Print all characters that have the highest frequency
        System.out.println();
        System.out.println("Most frequent character(s):");

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCount) {
                char letter = (char) ('a' + i);
                System.out.println(letter + " (" + maxCount + ")");
            }
        }

        // Close the scanner
        input.close();
    }
}
