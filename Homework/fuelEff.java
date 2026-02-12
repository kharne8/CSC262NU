import java.util.Scanner;

public class fuelEff {

    public static void main(String[] args) {

        // Tell the user what this program is going to do
        System.out.println("This program calculates the fuel cost per 100 miles");
        System.out.println("and determines how far a car can go with a full tank of gas.");
        System.out.println();

        // Create a scanner so we can read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of gallons currently in the tank
        System.out.print("Enter the number of gallons of gas in the tank (floating-point number): ");
        double gallonsInTank = input.nextDouble();

        // Ask the user for the car's fuel efficiency in miles per gallon
        System.out.print("Enter the fuel efficiency in miles per gallon (floating-point number): ");
        double milesPerGallon = input.nextDouble();

        // Ask the user for the price of gas per gallon
        System.out.print("Enter the price of gas per gallon (floating-point number): ");
        double pricePerGallon = input.nextDouble();

        // Calculate how many miles the car can travel with a full tank
        double milesWithFullTank = gallonsInTank * milesPerGallon;

        // Calculate how many gallons are needed to travel 100 miles
        double gallonsFor100Miles = 100.0 / milesPerGallon;

        // Calculate the cost to travel 100 miles
        double costPer100Miles = gallonsFor100Miles * pricePerGallon;

        // Display the calculated fuel cost per 100 miles
        System.out.println();
        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);

        // Display how far the car can travel with a full tank (whole number)
        System.out.printf("Distance the car can travel with a full tank: %.0f miles%n", milesWithFullTank);

        // Close the scanner since we are done getting input
        input.close();
    }
}
