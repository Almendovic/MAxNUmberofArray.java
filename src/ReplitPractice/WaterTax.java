package ReplitPractice;

import java.util.Scanner;

public class WaterTax {


    public static double waterTax(double units) {
        //WRITE YOUR CODE BELOW:
        if (units > 150) {
            return units * 0.9 + 100;
        } else if (units > 100) {
            return units * 0.9 + 50;
        } else if (units > 50) {
            return units * 0.9;
        } else if (units <= 50) {
            return units * 0.6;
        } return units;
    }



        //end waterTax

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println(waterTax(in.nextDouble()));
        }

    }






