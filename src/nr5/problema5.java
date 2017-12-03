//Write a program that prompts for two numbers. Print the
//        sum, difference, product, and quotient of those numbers as
//        shown in the example output:


package nr5;

import java.util.Scanner;

public class problema5 {

    public static void main(String[] args) {
        int nr1 = giveNumber("Give the first number: ");
        int nr2 = giveNumber("Give the second number: ");
        sum(nr1, nr2);
        diff(nr1, nr2);
        product(nr1, nr2);
        div(nr1, nr2);

    }

    public static int giveNumber(String label) {
        System.out.print(label);
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int nr  = Integer.parseInt(number);
        return nr;
    }

    public static void sum(int nr1, int nr2) {
        int sum = nr1 + nr2;
        System.out.println("The sum is: " + sum);
    }

    public static void diff(int nr1, int nr2) {
        int difference = nr1 - nr2;
        System.out.println("The difference is: " + difference);
    }

    public static void product(int nr1, int nr2) {
        int product = nr1 * nr2;
        System.out.println("The product is: " + product);
    }

    public static void div(int nr1, int nr2) {
        if(nr2 != 0) {
            double divide = (double) nr1 / nr2;
            System.out.println("The divide is: " + divide);
        }
        else {
            System.out.println("Divide can not be calculated.");
        }
    }

}
