package day51Map_FunctionalInterface;

import ReplitPractice.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        String  str="aabcccdeeeef";


        String [] arr= str.split("");// todo split every character


        Map<String,Integer> result = new LinkedHashMap<>();


        for (String each : arr) {
            int frequency= Collections.frequency(Arrays.asList(arr),each); // todo to convert Array to list
            if(frequency==1){

                //        key    value
                result.put(each,frequency);
            }
        }


        System.out.println(result);





    }
}
