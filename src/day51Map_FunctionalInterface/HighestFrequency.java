package day51Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestFrequency {
    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String [] arr=str.split("");

  //         key       value
        Map<String ,Integer> result=new LinkedHashMap<>();

        for(String each:arr){

            result.put(each, Collections.frequency(Arrays.asList(arr),each));
        }

        System.out.println("result = " + result);


    }
}
  /*  Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

                Ex:
                str = "eeeeeaaabbbbccccdd"

                Output:
                {e=5, a=3, b=4, c=4, d=2 }
                character e has the highest frequency


                Write a program that can find the element that has the highest frequency in an arrayList
                Note: Must use a map

                Ex:
                list: [java, java, python, c#]

                output:
                [java=2, python=1, c#=1]
                element java has the highest frequency
*/