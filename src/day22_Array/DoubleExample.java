package day22_Array;

import java.util.Arrays;

public class DoubleExample {

    public static void main(String[] args) {

        double[] prices = new double[4];

        System.out.println(Arrays.toString(prices));


        prices[0]=9.99;
        prices[1]=13.10;
        prices[2]=20.30;
        prices[3]=24.30;

        System.out.println(Arrays.toString(prices));
        prices[2]=214.0;

        System.out.println(Arrays.toString(prices));





    }
}
