package day12_Switch;

import java.util.Scanner;

public class Verify {
    public static void main(String[] args) {
        int systemPin = 1234;
        int systemSSN = 1111;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your pincode: ");
        int inputPin = input.nextInt();
        System.out.println("Please enter  your last 4 digits of ssn");
        int inputSSn = input.nextInt();

        if (systemPin == inputPin && systemPin == inputSSn) {
            System.out.println("Authentication successful");
        } else {

            if (systemPin != inputPin) {
                System.out.println("Pin code is incorrect");
            }

            if (systemSSN != inputSSn) {
                System.out.println("Last 4 SSN numbers are incorrect");
            }


        }
    }
}
