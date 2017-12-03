//Create a program that prompts for a quote and an author.
//        Display the quotation and author as shown in the example
//        output.


package nr3.a;

import javax.swing.*;

public class problema3 {

    public static void main(String[] args) {
        String quote = readInputGUI("Quote", "Write a quote: ");
        String author = readInputGUI("Author", "Who said the quote? ");

        System.out.println(author + " says, \"" + quote + "\".");
    }

    public static String readInputGUI(String label, String title) {
        String input = JOptionPane.showInputDialog(null, label, title, JOptionPane.INFORMATION_MESSAGE);
        return input;
    }
}
