package ReplitPractice;

import java.util.Scanner;

public class Confirmation_Bot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);

        switch (response){
            case 'y':
                System.out.println("Your request is being processed");
                break;
            case 'n':
                System.out.println("Thank you fro your consideration");
                break;
            case 'h':
                System.out.println("Sorry, no live agents are currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again");

        }





    }
}
