import java.util.Scanner;

public class gpaConv {

    public static void main(String[] args) {

        // Explain what the program does
        System.out.println("This program converts a letter grade into a GPA value");
        System.out.println("and displays the corresponding percentage range.");
        System.out.println();

        // Create a scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a letter grade
        System.out.print("Enter a letter grade (A, A-, B+, B, etc.): ");
        String letterGrade = input.nextLine().toUpperCase();

        // Variables to store GPA and percentage range
        double gpa;
        String percentageRange;

        // Determine GPA and percentage range based on the letter grade
        switch (letterGrade) {
            case "A":
                gpa = 4.0;
                percentageRange = "94.00% to 100.00%";
                break;
            case "A-":
                gpa = 3.7;
                percentageRange = "90.00% to 93.99%";
                break;
            case "B+":
                gpa = 3.3;
                percentageRange = "87.00% to 89.99%";
                break;
            case "B":
                gpa = 3.0;
                percentageRange = "83.00% to 86.99%";
                break;
            case "B-":
                gpa = 2.7;
                percentageRange = "80.00% to 82.99%";
                break;
            case "C+":
                gpa = 2.3;
                percentageRange = "77.00% to 79.99%";
                break;
            case "C":
                gpa = 2.0;
                percentageRange = "73.00% to 76.99%";
                break;
            case "C-":
                gpa = 1.7;
                percentageRange = "70.00% to 72.99%";
                break;
            case "D+":
                gpa = 1.3;
                percentageRange = "67.00% to 69.99%";
                break;
            case "D":
                gpa = 1.0;
                percentageRange = "63.00% to 66.99%";
                break;
            case "D-":
                gpa = 0.7;
                percentageRange = "60.00% to 62.99%";
                break;
            case "F":
                gpa = 0.0;
                percentageRange = "59.99% and below";
                break;
            default:
                // Handle invalid letter grades
                System.out.println("Error: Invalid letter grade entered.");
                System.out.println("Please enter a valid grade such as A, B+, C-, or F.");
                input.close();
                return;
        }

        // Display the final results
        System.out.println();
        System.out.printf("Letter Grade: %s%n", letterGrade);
        System.out.printf("GPA Value: %.1f%n", gpa);
        System.out.printf("Percentage Range: %s%n", percentageRange);

        // Close the scanner
        input.close();
    }
}
