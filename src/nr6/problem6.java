//Create a program that determines how many years you have
//        left until retirement and the year you can retire. It should
//        prompt for your current age and the age you want to retire
//        and display the output as shown in the example that follows


package nr6;

import java.time.Year;
import java.util.Scanner;


public class problem6 {


    public static void main(String[] args) {
        int age = input("What is your age? ");
        int retirementAge = input("At what age do you want to retire? ");
        calculate(age, retirementAge);
        }

    public static int input(String label) {

        Scanner scan = new Scanner(System.in);
        System.out.print(label);
        String input = scan.nextLine();
        int number = Integer.parseInt(input);
        return number;
    }

    public static void calculate(int a, int b) {
        int yearsLeft = b - a;
        if(yearsLeft <= 0) {
            System.out.println("You can already retire.");
        }
        else {
            System.out.println("You have " + yearsLeft + " years left until retirement.");

            int currentYear =  Year.now().getValue();             //get current year
            int yearOfRetirement = currentYear + yearsLeft;
            System.out.println("It is " + currentYear + ", so you can retire in " + yearOfRetirement + ".");
        }
    }

}
