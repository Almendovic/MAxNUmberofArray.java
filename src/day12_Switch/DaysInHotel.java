package day12_Switch;

import java.util.Scanner;

public class DaysInHotel {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Party size");
        int partySize=input.nextInt();
        System.out.println("Enter Number of Days");
        int days= input.nextInt();
        int price=0;


        switch (partySize){
            case 1:
                System.out.println("Room type: single room");
                System.out.println("Price " + (price=days*100)+ "$");
                break;
            case 2:
                System.out.println("Room type : double room");
                System.out.println("Price " + (price=days*125)+ "$");
                break;
            case 3:
            case 4:
                System.out.println("Room type : Large room");
                System.out.println("Room Price "+ (price=days*150)+ "$");
            default:
                System.out.println("Invalid room number");


        }




    }
}
