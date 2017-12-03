//        • Create a variant of the program that prompts for the
//        number of people and the number of pieces each person
//        wants, and calculate how many full pizzas you need to
//        purchase.


package nr8.bb;

import nr8.aa.Problem8;

public class Problem8Variant {

    public static void main(String[] args) {

        int persons = Problem8.insertFromKeyboard("How many people? ");
        int totalSlicesWanted = slices(persons);
        pizzaNeeded(totalSlicesWanted);

    }

    public static int slices (int persons) {
        int totalSlicesWanted = 0;
        for (int i = 1; i <= persons; i++) {
            int slicesWanted = Problem8.insertFromKeyboard("How many slices does person number " + i + " want? ");
            totalSlicesWanted += slicesWanted;
        }
        System.out.println("You need " + totalSlicesWanted + " slices of pizza.");
        return totalSlicesWanted;
    }

    public  static void pizzaNeeded(int slicesWanted) {
        System.out.println("Every pizza has 8 slices.");
        int pizzas = slicesWanted/8;
        int slicesMod = slicesWanted%8;
        int slicesExtra = 8 - slicesMod;
        if(slicesMod != 0) {
            pizzas++;
            System.out.println("You need " + pizzas +" pizza. " + slicesExtra + " slices of pizza will be extra.");
        }
        else{
            System.out.println("You need exactly " + pizzas + " pizza.");
        }

    }
}
