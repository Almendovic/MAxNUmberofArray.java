package day12_Switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Month Number 1-12");
        int monthNumber=input.nextInt();


        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter,so wear a winter coat,gloves");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring, so wear a jeans and hoodie");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is Summer, so wear short and T-shirt");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is Fall, so wear coat and hat");
                break;
            default:
                System.out.println("Invalid month number");
        }










    }
}
