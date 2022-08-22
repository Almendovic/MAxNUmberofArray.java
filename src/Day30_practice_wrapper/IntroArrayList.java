package Day30_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {


        int[] a={4,2,1};

        System.out.println("Number of elements: " +a.length);
        System.out.println("Print the whole array: " + Arrays.toString(a));
        System.out.println("Accesss the first element: " +a[0]);
        System.out.println("Add elements to the array: -Cannot change size of array after");


        System.out.println("---------------------------------");

        ArrayList<Integer> nums=new ArrayList<>();//empty ArrayList
        System.out.println("NUmber of elements: "+ nums.size());
        System.out.println("Print the whole array: " + nums);

        System.out.println("adding to ArrayList: add() method");
        nums.add(5);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.size());
    }
}
