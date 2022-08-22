package Day31ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {


        /*Four or less

Given an ArrayList of Strings, go through and find Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList. Print that ArrayList of words

Ex:
	Input:
		“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
	Output:
		 [ tree, loop, cat ]

         */

        ArrayList<String> words = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> result = new ArrayList<>();
        for (String each : words) {


            if (each.length() > 4) {
               continue;

            }else{
                result.add(each);
            }



        }System.out.println(result);
    }
}

