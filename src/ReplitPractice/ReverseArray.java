package ReplitPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {




        /*
        Given a String [] words, find and print the longest word in the array. You can assume the elements will have different lengths.
Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.
Main topics: arrays, primitive datatypes, concatenation, index, operators. loops, if statement, String
         */


        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOw
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > result.length()) {
                result = words[i];
            }

        }
        System.out.println(result);


    }
}

