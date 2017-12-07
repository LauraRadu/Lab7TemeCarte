/*
Write a program that converts a number from 1 to 12 to the
corresponding month. Prompt for a number and display the
corresponding calendar month, with 1 being January and
12 being December. For any value outside that range, display
an appropriate error message.
Example Output
Please enter the number of the month: 3
The name of the month is March.
Constraints
• Use a switch or case statement for this program.
• Use a single output statement for this program.
Challenges
• Use a map or dictionary to remove the switch statement
from the program.
• Support multiple languages. Prompt for the language
at the beginning of the program.
 */

package nr21;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        int number = input("Write the number corresponing to a month: ");
        String month = "";
        switch(number) {
            case 1: month = "January";
            break;
            case 2: month = "February";
            break;
            case 3: month = "March";
            break;
            case 4: month = "April";
            break;
            case 5: month = "May";
            break;
            case 6: month = "June";
            break;
            case 7: month = "July";
            break;
            case 8: month = "August";
            break;
            case 9: month = "September";
            break;
            case 10: month = "October";
            break;
            case 11: month = "November";
            break;
            case 12: month = "December";
            break;
        }
        System.out.println("The name of the month is " + month + ".");
    }

    public static int input(String label) {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean found = false;

        while (number <= 0 || number > 12 || found == false) {

            System.out.print(label);

            try {
                number = scan.nextInt();
                if (number > 0 && number <= 12) {
                    found = true;
                }
                else{
                    System.out.println("Not a valid number!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Please enter a valid number.");
                scan.next();
            }
        }

        return number;
    }
}
