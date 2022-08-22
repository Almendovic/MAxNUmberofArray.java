package Day31ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WitchPair {
    public static void main(String[] args) {

        /*
        Switch Pairs

Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.

The given ArrayList will always have an even number of elements so each element will always have a single pair.

Ex:
Input: {"Cat", "in", "the", "hat"}

There is two pairs:
"Cat" and "in"
 "the" and "hat"

Output: {"in", "Cat", "hat", "the”}


         */


        ArrayList<String >words=new ArrayList<>(Arrays.asList("in", "Cat", "hat", "the"));




        for (int i = 0; i < words.size(); i=i+2) {
            String removed=words.remove(i);
            words.add(i+1,removed);
        }
        System.out.println(words);


    }
}
