//Create a simple mad-lib program that prompts for a noun,
//        a verb, an adverb, and an adjective and injects those into a
//        story that you create.


package nr4;

import java.util.Scanner;

public class problema4 {

    public static void main(String[] args) {
        String subst = readMe("Introduceti un substantiv: ");
        String verb = readMe("Introduceti un verb: ");
        String adv = readMe("Introduceti un adverb: ");
        String subst2 = readMe("Introduceti un substantiv: ");

        System.out.println(String.format("Intr-o zi frumoasa de vara, un %s %s %s impreuna cu %s lui. Funny!", subst, verb, adv, subst2));

}

    public static String readMe(String input) {
        System.out.println(input);
        Scanner scan = new Scanner(System.in);
        String myString = scan.nextLine();
        return myString;
    }

}

