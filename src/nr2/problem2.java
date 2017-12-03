//Create a program that prompts for an input string and displays
//        output that shows the input string and the number of
//        characters the string contains.
//        Constraints
//        • Be sure the output contains the original string.
//        • Use a single output statement to construct the output.
//        • Use a built-in function of the programming language to
//        determine the length of the string.


        package nr2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
//import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        String input = readStringGUI("Please give me your String: ");

        if(input.isEmpty()) {
            System.out.println("You must enter at least one character!");
        }
        else {
            System.out.println("Your input string contains " + input.length() + " characters.");
        }
    }

    public static String readStringGUI(String label) {
        String input = JOptionPane.showInputDialog( null,
                label);
        return input;
    }
}
