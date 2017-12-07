/*
Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time,
and display the amount accrued (principal + interest).
The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the
number of years the amount is invested, and A is the amount at the end of the investment.
Constraints
• Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
• Ensure that fractions of a cent are rounded up to the next penny.
• Ensure that the output is formatted as money. Challenges
• Ensure that the values entered for principal, rate, and number of years are numeric and that the program will
not let the user proceed without valid inputs.
• Alter the program to use a function called calculateSimpleInterest that takes in the rate, principal, and number
of years and returns the amount at the end of the investment.
• In addition to printing out the final amount, print out the amount at the end of each year.
 */

package nr12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        double principal = input("Principal? ");
        double rate = input("Annual rate of interest introduced as a percentage? ");
        int time = (int) input("Number of years of investment? ");
        double finalAmount = calculateSimpleInterest(principal,rate,time);
        System.out.println("After " + time + " years, your final amount is $" + finalAmount + ".");

    }

    public static double calculateSimpleInterest(double principal, double rate, int years) {
        double finalAmount = 0.0;
        for (int i = 1; i <= years ; i++) {
            finalAmount = principal * (1 + rate/100 * i);
            finalAmount = Math.round(finalAmount * 100.0) / 100.0;
            System.out.println("After " + i + " years, at " + rate + "% interest, your amount will be $" + finalAmount);
        }

        return finalAmount;

    }

    public static double input(String label) {

        Scanner scan = new Scanner(System.in);
        double input = -1;

        while(input < 0) {
            System.out.print(label);

            try {
                input = scan.nextFloat();
                if(input < 0) {
                    System.out.println("Invalid input!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scan.next();
            }
        }

        return input;
    }
}
