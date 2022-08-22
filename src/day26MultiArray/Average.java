package day26MultiArray;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {

        /*

        1) see the average of each array
        2) see the total average of all numbers in the array

        average=sum of nubmers/amount of numbers

         */
        int totalSum=0;
        int totalElements=0;


        int[][] nums={
                {3,5,1,2},
                {2,1,5,10,8},
                {3,1,5,12},



        };
        for(int[] eachInner:nums){


            int sum=0;// resets for next array


            for(int eachNum:eachInner){//
                sum+=eachNum;
            }

            System.out.println(Arrays.toString(eachInner));
            System.out.println("Average: "+(double)sum/ eachInner.length);// eachInner: [3,5,1,2]
            //sum 11
            totalSum+=sum;
            totalElements+=eachInner.length;

        }

        System.out.println("Total average of nums: "+(double)totalSum/totalElements);





    }
}
