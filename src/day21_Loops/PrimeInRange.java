package day21_Loops;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to go to?");
        int range = input.nextInt();

        for (int i = 2; i <= range; i++) {// starting from 2 going untill the range number
            boolean isPrime = true;// every tim

            for (int j = 2; j < i; j++) { // startingfrom 2 because i want to checl divisibility of th enumber

                if (i % j == 0) { // the number we are checking (i) is evenly divisible by the y values
                    isPrime = false;
                    break;// break stops the inner loop
                }


            }// end of the inner loop
            if(isPrime){
                System.out.println("Prime number is :" + i);
            }


        }// the end of the outter loop
    }
}
