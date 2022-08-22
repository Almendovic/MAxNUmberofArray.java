package day22_Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        // store the elements; 10,20,50,70

        int[] numbers ={10,20,50,70};// size : 4


        System.out.println(Arrays.toString(numbers));


        System.out.println("------------------------------------");

        //create a variable that can contain  scores

      int[] scores= new int[5];

          scores[1]=85;
          scores[scores.length-1]=95; // to assign last index use -1
         scores[3]=75;
         scores[0]=65;
         scores[2]=55;
       // System.out.println(Arrays.toString(scores));

        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------------------------");
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};





    }
}
