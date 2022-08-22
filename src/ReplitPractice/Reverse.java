package ReplitPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        /*f the word is less than 5 characters: print Too short!
If the word is more than 5 characters: print Too long!
If the word is 5 characters: print the reversed version of the String. Reading characters from the end to the beginning.

         */
        if (word.length() < 5)
            System.out.println("Too short!");
        else if (word.length() > 5) {
            System.out.println("Too long!");
        } else {
            System.out.println(" " + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        }
    }
}

