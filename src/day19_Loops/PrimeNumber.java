package day19_Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        /*
        Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime

         */

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a any number to find prime number: ");
        int num = s.nextInt();
        boolean con = num % 2 != 0&& num % 3 != 0 && num % 5 != 0 && num % 7 != 0;
        while (num != 0) {
            if (num == 5 ||num == 3 ||num == 2 ||num == 7 ||con){
                System.out.println("Prime number");
            }else{
                System.out.println("Not Prime");
            }
            break;
        }


    }
}

