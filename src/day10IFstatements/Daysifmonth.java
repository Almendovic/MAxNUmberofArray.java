package day10IFstatements;

import java.util.Scanner;

public class Daysifmonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number from 1-12");
        int month = input.nextInt();
        int day = 0;

        boolean has31days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;


        if (has31days) {
            day = 31;
        } else if (has30days) {
            day = 30;
        } else if (month == 2) {
            day = 28;
        }

        if (day > 0) {
            System.out.println("Month: " + month);
            System.out.println("Days in the month: " + day);
        } else {
            System.out.println(month + "is not a valid data");

        }


    }
}
