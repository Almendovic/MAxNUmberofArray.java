package day33ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SumString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513", "4913", "1248"));
        System.out.println(list);
        System.out.println(sumDigits(list));
    }

    public static ArrayList<Integer> sumDigits(ArrayList<String> list){

        ArrayList<Integer> nums = new ArrayList<>();

        for(String each : list){ // each is every whole number as String format

            int sum = 0;

            for(String eachDigit : each.split("")){ // splits the each into a String array where each digit is a separate element
                sum += Integer.parseInt(eachDigit);
            }

            nums.add(sum);

        }
        return nums;
    }

}
