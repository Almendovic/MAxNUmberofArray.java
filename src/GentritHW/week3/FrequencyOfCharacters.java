package GentritHW.week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {


    public static void main(String[] args) {


        System.out.println("Frequncy(\"aaaabbbbcccdddd\") = " + Frequncy("aaaabbbbcccdddd"));


    }
    public static Map<String, Integer> Frequncy(String str){




        String duplicate= "";
        //     bca
        //     235

        String [] arr=str.split("");
        //Collections.frequency()
        Map<String,Integer> result =new LinkedHashMap<>(); //    {b=2.c=3.g=5}

        for (String each : arr) { // each: characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr),each));

        }

     return result;





    }





}









