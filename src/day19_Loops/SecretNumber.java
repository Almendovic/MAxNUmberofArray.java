package day19_Loops;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

     int secretNumber=87;
     int inputNUmber;
     int attempt=0;

        Scanner input=new Scanner(System.in);

        do {
            System.out.println("Guess a number");
            inputNUmber = input.nextInt();


            if (inputNUmber<secretNumber) {
                System.out.println("Number is higher");

            } else if (inputNUmber>secretNumber) {
                System.out.println("Number is is lower");
            }

            attempt++;


        }while(secretNumber!=inputNUmber);

        System.out.println("You guessed the number in " +attempt+ " attempts");

        }


        }











