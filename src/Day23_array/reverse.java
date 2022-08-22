package Day23_array;

import java.util.Arrays;

public class reverse {
    /*

Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};

        System.out.print(Arrays.toString(numbers));
        System.out.println();

        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 3;
        numbers[3] = 2;
        numbers[4] = 1;
        System.out.print(Arrays.toString(numbers));
        System.out.println();

       // int[] numbers2 = new int[5];
        int[] numbers2 = {1, 2, 3, 4, 5};
        for (int i = numbers2.length-1, j = 0; i >= 0; i--, j++) {
            numbers2[j] = numbers[i];
        }
        System.out.println(Arrays.toString(numbers2));


    }
}









