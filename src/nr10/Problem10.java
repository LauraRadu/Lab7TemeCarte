/*
Create a simple self-checkout system. Prompt for the prices
and quantities of three items. Calculate the subtotal of the
items. Then calculate the tax using a tax rate of 5.5%. Print
out the line items with the quantity and total, and then print
out the subtotal, tax amount, and total.
Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
Constraints
• Keep the input, processing, and output parts of your
program separate. Collect the input, then do the math
operations and string building, and then print out the
output.
• Be sure you explicitly convert input to numerical data
before doing any calculations.
Challenges
• Revise the program to ensure that prices and quantities
are entered as numeric values. Don’t allow the user to
proceed if the value entered is not numeric.
• Alter the program so that an indeterminate number of
items can be entered. The tax and total are computed
when there are no more items to be entered.
 */


package nr10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        double subtotal = list();
        System.out.println("Subtotal: $" + subtotal);

        double tax = 5.5/100;
        double totalTax = tax * subtotal;
        System.out.println("Tax: $" + totalTax);

        double total = subtotal + totalTax;
        System.out.println("Total: $" + total);

    }

    public static double insertFromKeyboard(String label) {
        System.out.print(label);

        Scanner scan = new Scanner(System.in);
        double number;

        try {
            number = scan.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid number!");
            number = insertFromKeyboard(label);
        }

        if(number < 0) {
            System.out.println("Invalid number!");
            number = insertFromKeyboard(label);
        }

        return  number;
    }

    public  static double list() {
        double price = 0.0;
        double quantity = 1.0;
        int counter = 1;
        double subtotal = price;
        while (price != 0 || quantity != 0) {
            price = insertFromKeyboard("Enter the price of item " + counter + ": $");
            quantity = insertFromKeyboard("Enter the quantity of item " + counter + ": ");
            subtotal += price;
            counter++;
        }

        return subtotal;
    }
}
