package Day25Arrays;

import java.util.Arrays;

public class MultiDimensionalArratsIntro2 {
    public static void main(String[] args) {

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};

        for (int i = arr2d.length - 1; i >= 0; i--) { // i index number of 1d arrays starting from last index to 0
            for (int j = 0; j < arr2d[i].length; j++) { //arr2d[i] single dimensional array,j index # of elements stating from 0
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("--------------------------------------------");

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = arr2d.length - 1; j >= 0; j--) {
                System.out.print(arr2d[i][j]+" ");
            }System.out.println();
        }

    }

}



