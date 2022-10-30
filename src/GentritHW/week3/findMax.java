package GentritHW.week3;

import java.util.Arrays;

public class findMax {
    public static void main(String[] args) {
        int[] arr1= {1, 4, 6, 7, 2, 10};
        maxNumber(arr1);
    }
    public static int maxNumber(int[] numbers){
        int max = 0;
        int min = 0;
        Arrays.sort(numbers);
        max = numbers[numbers.length-1];
        /**
         *  min = numbers[0]; if we want to find min number
         */

        System.out.println("max = " + max);

        return max;

    }
}
