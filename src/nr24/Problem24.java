/*
Create a program that compares two strings and determines
if the two strings are anagrams. The program should prompt
for both input strings and display the output as shown in
the example that follows.
Example Output
Enter two strings and I'll tell you if they
are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
Constraints
• Implement the program using a function called isAnagram,
which takes in two words as its arguments and
returns true orfalse. Invoke this function from your main
program.
• Check that both words are the same length.
Challenge
• Complete this program without using built-in language
features. Use selection or repetition logic instead and
develop your own algorithm.
 */

package nr24;

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String firstString = input("Enter first string: ");
        String secondString = input("Enter second string: ");
        boolean found = isAnagram(firstString, secondString);

        if (found == false) {
            System.out.println("They are not anagrams");
        } else {
            System.out.println(firstString + " and " + secondString + " are anagrams.");
        }
    }

    private static String input(String label) {
        System.out.print(label);
        Scanner scan = new Scanner(System.in);
        String myString = scan.nextLine();
        return myString;
    }

    private static boolean isAnagram(String a, String b) {
        char[] firstString = a.toCharArray();
        char[] secondString = b.toCharArray();


        System.out.println(firstString);
        boolean found = false;


        for (int i = 0; i < firstString.length; i++) {
            if (firstString[i] != ' ') {
                for (int j = 0; j < secondString.length; j++) {

                    if (firstString[i] == secondString[j]) {
                        secondString[j] = ' ';             // daca litera din 1 se regaseste in 2, facem litera din 2 un spatiu gol
                        found = true;
                        break;
                    }
                }

                if (found == false) break;         //daca litera din 1 nu s-a gasit in 2, iese si din primul for
                if(i < firstString.length - 1) found = false;       // found redevine fals pentru toate literele din 1, mai putin pentru ultima litera
            }
        }

        //verificam daca stringul 2 este compus numai din spatii libere. Daca da, inseamna ca cele doua siruri au aceleasi litere
        for (int i = 0; i < secondString.length; i++) {
            if (secondString[i] != ' ') {
                found = false;
                break;
            }
        }

        return found;
    }

}
