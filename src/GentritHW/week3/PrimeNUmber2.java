package GentritHW.week3;

import java.util.Scanner;

public class PrimeNUmber2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = input.nextInt();
        boolean primeNumber = num %2 !=0 && num%3 !=0 && num %5 !=0 && num %7!=0;

        while(num != 0){

            if (num==5 || num==3 || num==7 || num== 2 || primeNumber) {
                System.out.println("Prime");

            }else{
                System.out.println("Not prime");

            }
            break;

        }
    }
}




