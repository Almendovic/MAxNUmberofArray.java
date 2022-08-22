package day22_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {


        int[] num; // declaring an int array

        num= new int[5]; // initializing the array with 5 spaces, 0,0,0,0,0

        System.out.println(num[0]);

        num[0]=10;
        System.out.println(num[0]);

        num[3]=25;
        System.out.println(num[3]);

        System.out.println(Arrays.toString(num));

        int[]other={5,7,10,-8,20,12};
        System.out.println(other[1]);
        System.out.println(other[4]);
       // System.out.println(other[100]); out of bound


    }
}
