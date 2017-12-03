/*
Calculate gallons of paint needed to paint the ceiling of a
room. Prompt for the length and width, and assume one
gallon covers 350 square feet. Display the number of gallons
needed to paint the ceiling as a whole number.
Example Output
You will need to purchase 2 gallons of
paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.
Constraints
• Use a constant to hold the conversion rate.
• Ensure that you round up to the next whole number.
Challenges
• Revise the program to ensure that inputs are entered as
numeric values. Don’t allow the user to proceed if the
value entered is not numeric.
• Implement support for a round room.
• Implement support for an L-shaped room.
• Implement a mobile version of this app so it can be used
at the hardware store.
 */


package nr9;

import nr8.aa.Problem8;


public class Problem9 {
    public static void main(String[] args) {
        int number = Problem8.insertFromKeyboard("Insert 1 for square room, 2 for L room or 3 for round room.");
        if(number==1 || number==2 || number==3) {
            switch(number) {
                case 1: squareRoom();
                    break;
                case 2: roomL();
                    break;
                case 3: roundRoom();
                    break;
            }
        }
        else{
            System.exit(1);
        }

    }

    public static void squareRoom() {
        int width = Problem8.insertFromKeyboard("The width of your ceiling in feet? ");
        int length = Problem8.insertFromKeyboard("The length of your ceiling in feet? ");
        int area  = width * length;
        calculus(area);
    }

    public static void roomL() {
        int widthBig = Problem8.insertFromKeyboard("The biggest width of your ceiling in feet? ");
        int widthSmall = Problem8.insertFromKeyboard("The smallest width of your ceiling in feet? ");
        int lengthBig = Problem8.insertFromKeyboard("The biggest length of your ceiling in feet? ");
        int lengthSmall = Problem8.insertFromKeyboard("The smallest length of your ceiling in feet? ");
        int area = lengthBig*widthSmall + lengthSmall*(widthBig-widthSmall);
        calculus(area);
    }

    public static void roundRoom() {
        int diameter = Problem8.insertFromKeyboard("The diameter of the ceiling? ");
        double radius = diameter/2.0;
        final double pi = Math.PI;
        double area = pi * radius * radius;

        calculus(area);
    }

    public static void calculus(double area){
        double oneGallon = 350.0;
        double paintNeeded = Math.ceil(area/oneGallon);
        System.out.println("The area of your ceiling is " + area + " square feet. You need " + paintNeeded + " gallons of paint for it.");
    }
}
