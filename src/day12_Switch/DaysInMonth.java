package day12_Switch;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Month");
        String monthDays=input.nextLine();

        switch (monthDays){
            case "February":
                System.out.println("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid Month Entry");



        }










    }
}
