package day33ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Removenums {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 2, 5, 2, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));

        //remove all the # <5

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 5) {
                nums.remove(i);//TODO i-- fixes the order
                i--;// if I removed an element, the elements will move over which means their index will change, I subtract 1 to make sure I don't skip any elements
            }

        }
        System.out.println(nums);



        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 5, 2, 5, 2, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));

        nums2.removeIf(n -> n <5); //removes numbers less than 5 ->

        System.out.println(nums2);


    }







}



