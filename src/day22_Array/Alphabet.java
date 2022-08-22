package day22_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26]; //Z to A

        alphabets[0] = 'Z'; //toString() coverts Array to String
        alphabets[1] = 'Y';
        System.out.println(Arrays.toString(alphabets));//print the whole array
        //System.out.println(alphabets[0]);//printing elements of array

        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }
        System.out.print(Arrays.toString(alphabets));


    }








    }

