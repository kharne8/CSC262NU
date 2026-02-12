import java.util.Scanner;

public class dataAnalyzer {

    public static void main(String[] args) {

        // Tell the user what this program does
        System.out.println("This program analyzes a list of numbers.");
        System.out.println("It finds the average, smallest value, largest value, and range.");
        System.out.println("Enter anything that is not a number to stop.");
        System.out.println();

        // Create a scanner to read input
        Scanner input = new Scanner(System.in);

        // Variables to keep track of the numbers
        double sum = 0;
        int count = 0;
        double smallest = 0;
        double largest = 0;

        // Ask the user to enter numbers
        System.out.print("Enter a number: ");

        // Keep reading numbers until the user enters something else
        while (input.hasNextDouble()) {
            double value = input.nextDouble();

            // For the first number, set both smallest and largest
            if (count == 0) {
                smallest = value;
                largest = value;
            }

            // Add the number to the total
            sum += value;

            // Count how many numbers were entered
            count++;

            // Update smallest if needed
            if (value < smallest) {
                smallest = value;
            }

            // Update largest if needed
            if (value > largest) {
                largest = value;
            }

            // Ask for another number
            System.out.print("Enter a number: ");
        }

        // Only calculate results if at least one number was entered
        if (count > 0) {
            double average = sum / count;
            double range = largest - smallest;

            System.out.println();
            System.out.println("Average: " + average);
            System.out.println("Smallest value: " + smallest);
            System.out.println("Largest value: " + largest);
            System.out.println("Range: " + range);
        } else {
            System.out.println();
            System.out.println("No numbers were entered.");
        }

        // Close the scanner
        input.close();
    }
}
