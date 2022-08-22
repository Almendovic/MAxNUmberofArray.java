package day26MultiArray;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        /*


        Given a 2D int array merge the elements into one 1D array

           Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

       Output:
              [ 10, 20, 30, 5, 10, 15 ]

         */

        int[][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };
        System.out.println(Arrays.deepToString(nums));

        String s = "";
        for (int[] element : nums) {
            for (int each : element) {
                s += each+" ";


            }  String[] merge = s.split(" ");
            System.out.println(Arrays.toString(merge));

    }
/*

        String str = "";
        for (int[] each : nums) {
            for (int a : each) {
                str+=a+" ";
            }

        }
        String [] merge=str.trim().split(" ");
        System.out.println(Arrays.toString(merge));*/


    }
}








