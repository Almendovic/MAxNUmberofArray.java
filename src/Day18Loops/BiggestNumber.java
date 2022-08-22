package Day18Loops;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        /*
        ask the user to type 5 numbers
        find the biggest number
        4
        142
        230
        32
        5
         */
        Scanner input = new Scanner(System.in);
        int max = -2147483647;
        int min = 2147483647;
        int num = 0; // to keep truck of the iterations
        // System.out.println(Integer.MAX_VALUE); //TODO to check variable max value

        while (num++ < 5) { // this loop will run for 5 times|| start from and go until <=5
            System.out.println("Enter a number");
            int inputNum= input.nextInt();

            if(inputNum >max){
                max=inputNum; // if the new number from the console is bigger than our current biggest number, we found a new max number and should reassign it to the variable
            }
            if(inputNum<min){
                min=inputNum;
            }

        }
        System.out.println("Max: " +max);
        System.out.println("Min: " +min);
    }
}
