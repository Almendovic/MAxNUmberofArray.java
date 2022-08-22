package Day27Methods;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        int[][] nums = {{10, 20, 30}, {5, 10, 15}};

        int size = 0;

        for (int[] eachArray : nums) {
            size += eachArray.length;// to count the total # of lements,which should be the size of the merged array
        }

        int[] merged = new int[size];

        int indexToStore = 0;

        for (int[] eachArray : nums) {
            for (int eachNum : eachArray) {
                merged[indexToStore++]=eachNum;// assign the eachNum to the merged array
            }



        } System.out.println(Arrays.toString(merged));
    }
}
