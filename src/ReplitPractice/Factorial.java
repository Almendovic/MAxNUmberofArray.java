package ReplitPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int factorial=1;

        while(n>1){
            factorial*=n--;
        }
        System.out.println(factorial);










    }
}
