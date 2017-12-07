/*
Write a program that asks the user for their age and compare it to the legal driving age of sixteen. If the user is sixteen or
older, then the program should display “You are old enough to legally drive.” If the user is under sixteen, the program
should display “You are not old enough to legally drive.”
Example Output
What is your age? 15
You are not old enough to legally drive.
Or
What is your age? 35
You are old enough to legally drive.
Constraints
• Use a single output statement.
• Use a ternary operator to write this program. If your language doesn’t support a ternary operator, use a regular
if/else statement, and still use a single output statement to display the message.
Challenges
• If the user enters a number that’s less than zero or enters non-numeric data, display an error message that asks
the user to enter a valid age.
• Instead of hard-coding the driving age in your program logic, research driving ages for various countries and
create a lookup table for the driving ages and countries. Prompt for the age, and display which countries the user can legally drive in.
 */

package nr16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        input("What is your age?");
    }

    public  static void input(String label) {

        Scanner scan = new Scanner(System.in);
        int age = 0;

        while(age <= 0) {
            System.out.println(label);

            try {
                age = scan.nextInt();
                if(age > 0) {
                    String response = compareAge(age);
                    System.out.println(response);
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Error! Please enter a valid age.");
                scan.next();
            }
        }

    }

    public static String compareAge (int age) {
        int legalAge = 16;
        String response = age < legalAge ? "You are not old enough to legally drive.":"You are old enough to legally drive.";
        return response;
    }
}
