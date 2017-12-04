//Write a program to evenly divide pizzas. Prompt for the
//        number of people, the number of pizzas, and the number of
//        slices per pizza. Ensure that the number of pieces comes out
//        even. Display the number of pieces of pizza each person
//        should get. If there are leftovers, show the number of leftover
//        pieces.
//        Example Output
//        How many people? 8
//        How many pizzas do you have? 2
//        8 people with 2 pizzas
//        Each person gets 2 pieces of pizza.
//        There are 0 leftover pieces.
//        Challenges
//        • Revise the program to ensure that inputs are entered as
//        numeric values. Don’t allow the user to proceed if the
//        value entered is not numeric.
//        • Alter the output so it handles pluralization properly,
//        for example:
//        Each person gets 2 pieces of pizza.
//        or
//        Each person gets 1 piece of pizza.
//        Handle the output for leftover pieces appropriately as
//        well.


package nr8.aa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        int people = insertFromKeyboard("How many people? ");
        int pizza = insertFromKeyboard("How many pizzas? ");
        int slices = insertFromKeyboard("How many slices per pizza? ");
        int slicesPerPerson = slices*pizza/people;
        int slicesLeft = (slices*pizza)%people;

        if (slicesPerPerson == 1) {
            System.out.println("You are " + people + " persons. Each one of you recieves " + slicesPerPerson + " slice of pizaza.");
        }
        else {
            System.out.println("You are " + people + " persons. Each one of you recieves " + slicesPerPerson + " slices of pizza.");
        }

        if(slicesLeft == 1) {
            System.out.println("There is " + slicesLeft + " slice of pizza left");
        }
        else {
            System.out.println("There are " + slicesLeft + " slices of pizza left.");
        }


    }

    public static int insertFromKeyboard (String label) {

        Scanner scan = new Scanner(System.in);
        int number = 0;

        while(number <= 0) {
            System.out.print(label);

            try {
                number = scan.nextInt();

                if(number <= 0) {
                    System.out.println("Invalid number!");
                }

            }
            catch (InputMismatchException e) {
                System.out.println("Invalid number!");
               scan.next();      //fara asta, intra in loop infinit si printeaza labelul apoi intra direct in catch
            }
        }

        return  number;
    }
}
