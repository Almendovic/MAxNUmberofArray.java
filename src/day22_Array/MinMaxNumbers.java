package day22_Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] nums=new int[10];// 10 elements

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number:");
            nums[i]=input.nextInt(); // each user entered input will be assigned to the indexes of the array numbers
        }


        int max=nums[0];//index 0 max number
        int min=nums[0];// assumption

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]>max){
                max=nums[i];
            }

            if(nums[i]<min){
                min=nums[i];
            }


        }
        System.out.println("numbers= "+ Arrays.toString(nums));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
