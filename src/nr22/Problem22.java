/*
Write a program that asks for three numbers. Check first to
see that all numbers are different. If they’re not different,
then exit the program. Otherwise, display the largest number
of the three.
Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.
Constraint
• Write the algorithm manually. Don’t use a built-in
function for finding the largest number in a list.
Challenges
• Modify the program so that all entered values are
tracked and the user is prevented from entering a
number that’s already been entered.
• Modify the program so that it asks for ten numbers
instead of three.
• Modify the program so that it asks for an unlimited
number of numbers.
 */

package nr22;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        int number = 1;
        ArrayList<Integer> numbers = new ArrayList<>();

        while (number != 0) {
            number = input("Please introduce a number: ");      //programul se va opri din cerut numere cand se va introduce 0
            boolean found = repeatedNumber(numbers, number);
            if (found) {
                System.out.println("You have already entered this number!");
                System.exit(1);
            } else {
                if (number != 0) {
                    numbers.add(number);
                }
            }
        }
        if (numbers.size() > 0) {              //otherwise IndexOutOfBounds exception//daca se introduce 0 din prima
            int maxNumber = findLargestNumber(numbers);
            System.out.println("The biggest number is: " + maxNumber);
        }
    }

    public static int input(String label) {
        Scanner scan = new Scanner(System.in);
        int number = 0;

        System.out.print(label);
        try {
            number = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error! That was not a valid number!");     //programul se opreste
        }

        return number;
    }

    public static boolean repeatedNumber(ArrayList<Integer> numbers, int currentNumber) {
        boolean found = false;

        for (int i = 0; i < numbers.size() && found == false; i++) {
            if (numbers.get(i) == currentNumber) {
                found = true;
            }
        }

        return found;
    }


    public static int findLargestNumber(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
