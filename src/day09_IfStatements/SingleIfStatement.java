package day09_IfStatements;

import javax.sound.midi.Soundbank;

public class SingleIfStatement {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello"); //when the boolean is true it will print

        }
        System.out.println("break");  // normal print statement, not party
        if (false) {
            System.out.println("Bye"); // the boolean was false, will not run
        }
        System.out.println("-----------------------------");
        int year = 2021;
        if (year == 2020 || year == 2021) {
            System.out.println("Stay Home");
            System.out.println("Wash your hands");
            System.out.println("social distancing");
        }
        System.out.println("------------------------------");

        double price = 9.99;
        if (price >= 20) {
            System.out.println("Free Shipping");

        }
          System.out.println("------------------------------");

    }
}