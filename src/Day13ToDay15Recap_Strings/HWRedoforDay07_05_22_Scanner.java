package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class HWRedoforDay07_05_22_Scanner {
   /*Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters

    */
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter a word");
       String word=input.nextLine();
       word=word.trim();
       System.out.println(word.toLowerCase());
       System.out.println(word.length());






   }
}
