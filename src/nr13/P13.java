package nr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class P13 {
    abstract  double calculateMoney (double money, double rate, int years, int periodsPerYear);

    public static double input(String label) {
        double input = -1;
        Scanner scan = new Scanner(System.in);

        while(input < 0) {
            System.out.print(label);
            try {
                input = scan.nextFloat();
                if(input < 0) {
                    System.out.println("Invalid input!");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scan.next();
            }
        }

        return input;
    }
}
