package Day18Loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int ValidPin = 1234;
        int userPin;
        int attempts = 0;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Enter your Pin");
            userPin = input.nextInt();
            attempts++;
        } while (attempts < 3 && userPin != ValidPin);// keep running the loops if the attemps has been less than ) and the pin is the matching yet

            if (attempts <=3 && userPin == ValidPin) {
                System.out.println("Logged in");
            }else{
                System.out.println("Locked account, too many attempts");
                System.out.println(attempts);


        }
    }
}
