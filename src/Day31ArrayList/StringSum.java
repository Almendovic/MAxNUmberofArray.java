package Day31ArrayList;

import Day27Methods.numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSum {
    public static void main(String[] args) {



    /*String Sum

Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]

     */
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("123", "34", "513"));
        ArrayList<Integer> newNums = new ArrayList<>();

        for (String each : numbers) {
            int result = 0;
            for (int i = 0; i < each.length(); i++) {
                result += Integer.parseInt("" + each.charAt(i));
            }
            newNums.add(result);
        }

        System.out.println(newNums);


    }
}
