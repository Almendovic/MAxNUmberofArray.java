package day33ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(4,1,1,2,3,4,5,1,4,14,4,5,123));

        System.out.println("contains 4 "+nums.contains(4));
        System.out.println("contains 4 and 5 "+(nums.contains(4)&& nums.contains(5)));
        System.out.println("contains All " +nums.containsAll(Arrays.asList(4,3,5,1)));
        System.out.println("contains All " +nums.containsAll(Arrays.asList(4,3,5,6)));

        nums.retainAll(Arrays.asList(123,4,14));
        System.out.println(nums);



    }
}
