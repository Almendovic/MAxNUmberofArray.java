package Day24Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

    int[] arr ={1,2,3,4,5};
    int[] reverse =new int[arr.length];



    for (int i = arr.length - 1, y=0; i >= 0; i--,y++) {
            reverse[y]=arr[i];
        }

        System.out.println(Arrays.toString(reverse));


      /*  int[] num2 = {1, 2, 3, 4, 5};
        for (int i = num2.length - 1; i >= 0; i--) {
            System.out.print(num2[i]+ " ");*/


        }

    }

