/* Programmer: JAAR
*  Assignment Chapter: 4 question 11
*  Date modified: 10/13/2024
*  IDE/Tool used: IntelliJ
* Design a class that calculates a customer’s monthly bill. It should store
* the letter of the package the customer has purchased (A, B, or C) and the
* number of minutes that were used. It should have a method that returns the
* total charges. Demonstrate the class in a program that asks the user to
* select a package and enter the number of minutes used. The program should
* display the total charges.
* */

// Calculates a new customers bill based on the phone plan that they created
// and the minutes that they used in the first month.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mobileCustomer newCustomer;
        Scanner input = new Scanner(System.in);

        intro();
        newCustomer = getCustomerInfo(input);
        newCustomer.setMinutes(customerMonthlyUse(input));
        System.out.println();
        System.out.println();
        System.out.println("Receipt: ");
        printReceipt(newCustomer);
    }

    // Prints the introduction blurb for the user.
    public static void intro() {
        System.out.println("Please enter the customers information bellow so");
        System.out.println("I can calculate their monthly charge.");
        System.out.println("Please have the customers name, plan type, and");
        System.out.println("minutes (used) available.");
    }

    // Asks the user for the customer information and creates an account for
    // them in the DB [Not really since I'm still to lazy to create a DB].
    // Parameters:
    //  - Scanner: gets the user information.
    // Returns:
    //  - mobileCustomer newCustomer: customer with the name, device type,
    //  and plan already inputted.
    public static mobileCustomer getCustomerInfo(Scanner input) {
        System.out.print("Enter the customer name: ");
        String name = input.nextLine(); // Assumes the user enters the name
        // correctly.
        System.out.print("Enter the customers device type: ");
        String device = input.nextLine(); // Assumes the user enters the
        // device correctly.
        System.out.print("Enter the customers plan: ");
        char planType = input.nextLine().toLowerCase().charAt(0); // Ensures
        // the input is lowercase. Otherwise, assumes the user enters the
        // right char.
        return new mobileCustomer(name, device, planType);
    }

    // Gets the total minutes the customer used for the current month.
    // Return:
    //  - int minutes
    public static int customerMonthlyUse(Scanner input) {
        System.out.print("How many minutes did the customer use this month: ");
        return input.nextInt(); // Assumes the user enters an integer.
    }

    // Prints out the receipt with all the customers basic account
    // information.
    // Pram:
    //  - mobileCustomer newCustomer
    public static void printReceipt(mobileCustomer newCustomer) {
        System.out.println("Customer Name: " + newCustomer.getName());
        System.out.println("Customer Device: " + newCustomer.getDeviceType());
        System.out.println("Customer Plan: " + newCustomer.getPlan());
        System.out.println("_______________________________________________" +
                "_______");
        System.out.println();
        System.out.println("Minutes Used: " + newCustomer.getMinutes());
        // TODO: Add plan base rate and final price.
        System.out.printf("Monthly Total: $%.2f",newCustomer.getFinalCharge());
    }
}