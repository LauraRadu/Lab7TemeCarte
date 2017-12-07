/*
Write a simple program to compute the tax on an order amount. The program should prompt for the order amount
and the state. If the state is “WI,” then the order must be charged 5.5% tax. The program should display the subtotal,
tax, and total for Wisconsin residents but display just the total for non-residents.
Constraints
• Implement this program using only a simple if statement—don’t use an else clause.
• Ensure that all money is rounded up to the nearest cent.
• Use a single output statement at the end of the program to display the program results.
Challenges
• Allow the user to enter a state abbreviation in upper, lower, or mixed case.
• Also allow the user to enter the state’s full name in upper, lower, or mixed case.
 */

package nr14;

import nr13.P13;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        double initialValue = P13.input("What is the order amount? ");
        String state = input("What is the state? ");

        if(state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("wisconsin")) {
            double tax = 0.055*initialValue;
            initialValue += tax;
            System.out.println("The subtotal is $" + initialValue);
            System.out.println("The tax is $" + tax);
        }

        System.out.println("The total is $" + initialValue);


    }

    public static String input(String label) {
        System.out.print(label);

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        return input;
    }
}
