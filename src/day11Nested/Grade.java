package day11Nested;

import java.security.spec.RSAOtherPrimeInfo;

public class Grade {
    public static void main(String[] args) {

        int score = 40;

        if (score >= 75) {
            System.out.println("Pass");// if statements inside is statement makes it nested

            if (score > 92) {
                System.out.println("You did really well");
            } else if (score > 80) {
                System.out.println("Good job");
            } else {
                System.out.println("Not bad");
            }


        } else {
            System.out.println("Failed");

            if (score > 50) {
                System.out.println("Try Harder");
            } else {
                System.out.println("Study much more");
            }
        }


    }
}
