package day50Map;

import ReplitPractice.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str= "bbcccaaaa";
        //     bca
        //     235

         String [] arr=str.split("");
        //Collections.frequency()
        Map<String,Integer> result =new LinkedHashMap<>(); //    {b=2.c=3.g=5}

        for (String each : arr) { // each: characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr),each));

        }

        System.out.println(result);




    }




}
/*
2. Wirte a program that can return the freugency of characters
        Not: MUST use map
        Ex: str = "bbccctagag"
        output:
        {b=2.c=3.g=5}
*/
