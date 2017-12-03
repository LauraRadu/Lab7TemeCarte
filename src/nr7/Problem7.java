//Create a program that calculates the area of a room. Prompt
//        the user for the length and width of the room in feet. Then
//        display the area in both square feet and square meters
//• Revise the program to ensure that inputs are entered as
//        numeric values. Don’t allow the user to proceed if the
//        value entered is not numeric
//• Create a new version of the program that allows you to
//        choose feet or meters for your inputs.

package nr7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {
        double choice = input("Insert 1 for feet and 2 for meters.");

        while (!(choice == 1 || choice == 2)) {
            System.out.println("Not a valid number! Please insert a new one.");
            choice = input("Insert 1 for feet and 2 for meters.");
        }

        double width = input("What is the width of your room?");
        double length = input("What is the length of your room?");

        if(choice == 1) {
            System.out.println("Your room is " + width + " feet by " + length + " feet.");
            calculateArea("feet", width,length);
        }
        else if(choice == 2) {
            System.out.println("Your room is " + width + " meters by " + length + " meters.");
            calculateArea("meters", width,length);
        }
    }

    public static double input(String label) {
        System.out.print(label);

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double d = 0.0;

        try
        {
            d = Double.parseDouble(input);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Not a valid number! Please insert a new one.");
            d = input(label);
            //iesire fortata din program; daca nu as fi pus linia de deasupra
//            int i = 1;
//            System.exit(i);
        }

        while (d <= 0) {           //verific daca nr este negativ sau 0
            System.out.println("Not a valid number! Please insert a new one.");
            d = input(label);
        }

        return d;

    }


    public static void calculateArea (String s, double a, double b) {
        double area = a * b;
        double factor = 0.09290304;
        double areaMeters = 0.0;
        double areaFeet = 0.0;

        area = Double.parseDouble(new DecimalFormat("##.###").format(area));

        if (s.equals("feet")) {
            areaMeters = area * factor;
            areaMeters = Double.parseDouble(new DecimalFormat("##.###").format(areaMeters));
            System.out.println("Your room's ares is: " + "\n" + area + " square " + s + "\n" + areaMeters + " square meters");
        } else {
            areaFeet = area / factor;
            areaFeet = Double.parseDouble(new DecimalFormat("##.###").format(areaFeet));
            System.out.println("Your room's ares is: " + "\n" + area + " square " + s + "\n" + areaFeet + " square feet");
        }
    }


}
