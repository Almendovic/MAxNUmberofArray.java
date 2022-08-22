package PracticeAndHW;

import java.util.Scanner;

public class bankAtm {
    /*declare and assign two expected numbers:
	pincode: 1234
	ssn: 1111

ask the user to enter the two numbers and compare them with the system values defined above. If they match print Authentication successful

if they don't match print all the reasons that authentication failed:

	if the pincode was incorrect print: Pin Code is incorrect
	if the ssn was incorrect print: Last 4 SSN numbers are incorrect

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int validPincode = 1234;
        int validSSN = 7482;
        System.out.println("Welcome please verify your pin ");
        int userPincode = input.nextInt();
        System.out.println("Enter your last 4 ssn");
        int userSSN = input.nextInt();
        if (userSSN != validSSN && userPincode != validPincode) {
            System.out.println("Invalid pin and ssn");
            System.exit(1);

        } else if (userPincode == validPincode && userSSN == validSSN) {
            System.out.println("Verification passed !");
        } else if (userPincode != validPincode) {
            System.out.println("Pin code incorrect");

        } else if (userSSN != validSSN) {
            System.out.println("Last 4 SSN numbers are incorrect");
            System.exit(1);

        }
    }
}





