package day10IFstatements;

import java.util.Scanner;

public class Buzzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = input.nextInt();

        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");

        }else if(n%3==0){
            System.out.println("Fizz");
        }else if(n%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(n);
        }








    }
}
