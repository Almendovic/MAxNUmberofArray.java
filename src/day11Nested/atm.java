package day11Nested;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validPasscode = 7021;//passcode we need to give to login
        System.out.println("Welcome to the ATM. Enter your card and enter your passcode");

        int userPasscode = input.nextInt();// passcode the user inouts

        if (userPasscode == validPasscode) {
            System.out.println("Logged in!\n Select a number\n\t1)Check teh Balance\n\t2)Withdraw\n\t3)Deposit");
            int selection = input.nextInt();

            if (selection == 1) {
                System.out.println("Your balance is: $1_000_000_");
            } else if (selection == 2) {
                System.out.println("How much do you want to withdraw? ");
                System.out.println("Withdrawing $ " + input.nextInt());
            } else if (selection == 3) {
                System.out.println("Enter the amount you want to deposit");
                System.out.println("Depositing $ " + input.nextInt());
            }

        }else { // this else belongs to if on line 14
            System.out.println("invalid passcode");
        }


    }


}
