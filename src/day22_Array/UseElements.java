package day22_Array;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {

        int[]nums ={4,5,12};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));


        System.out.println(nums[0]+ nums[1]);
        String[]strs ={"Hello","World","java","code"};
        System.out.println(strs[2]);
        System.out.println(strs[2]+strs[3]);
        System.out.println(strs[2].length()+ strs[3].length());

        System.out.println(strs[1].charAt(strs[1].length()-1));// last index nof the element at index 1

        String s = strs[3];//assigning the new value of 3rd index of the array



    }
}
