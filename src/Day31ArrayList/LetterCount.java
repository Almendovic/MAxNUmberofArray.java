package Day31ArrayList;

import CanvasPractice.FrequncyOfCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LetterCount {
    public static void main(String[] args) {

        /*Count Letters

Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements

Ex:
Input:
	”java”, ”html”, “css”, “java”, “javascript”, “selenium”
	letter: ‘a’
Output:
	6



         */


        ArrayList<String> word = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        int count = 0;
        for (String each : word) {
            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}