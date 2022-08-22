package Day25Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays3 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        //3d array contains 2d arrays
        // 2d ar                0       1        2         0         1            2
        // 1d ar             0 1 2   0 1 2   0 1 2     0  1  2    0  1  2    0  1  2
        int[][][] arrd3 = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
        //  3d ar                           0                             1

        System.out.println(Arrays.deepToString(arrd3));

        //{10,20,30}, {40,50,60} {70,80,90}
        System.out.println(Arrays.deepToString(arrd3[1]));// 3d printing 2d
        //{40,50,60}
        System.out.println(Arrays.toString(arrd3[1][1]));


        //
        System.out.println(arrd3[0][2][2]);
        System.out.println("-------------------------------------");

        for (int[][] each2d : arrd3) {
            for (int[] each1d : each2d) {
                for (int element : each1d) {
                    System.out.print(element + " ");

                    System.out.println("------------------------------------");

                    int[][][][] arr4d = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}}};
                    //  4d

                    for (int[][][] each3d : arr4d) {
                        for (int[][] each2D : each3d) {
                            for (int[] each1D : each2D) {
                                for (int element1 : each1D) {
                                    System.out.println(element1+" ");
                                }

                            }
                        }

                    }
                }
            }
        }
    }
}


