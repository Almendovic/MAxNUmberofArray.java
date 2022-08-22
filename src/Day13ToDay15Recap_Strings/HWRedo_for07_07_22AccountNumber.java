package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class HWRedo_for07_07_22AccountNumber {
    /*
    create a class AccountNumber
ask the user enter an account number and check if the account number is valid. Accounts are valid if:
handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"

	- If the account number begins with a "2" the account number should be 7 characters long
		Print: "Valid 7-digit account number"
		Otherwise: "Invalid 7-digit account number"

	- If the account number begins with a "5" the account number should be 10 characters long
		Print: "Valid 5-digit account number"
		Otherwise: "Invalid 5-digit account number"

	— If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”

-----------------------------------------------------------------

create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The intials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL

     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Account Number");
        String AccountNumber=input.nextLine();

        int AccountNumberLength=AccountNumber.length();
        boolean StartsdWith2=AccountNumber.startsWith("2");
        boolean StartsWIth5=AccountNumber.startsWith("5");

        if(AccountNumber.isEmpty()){
            System.out.println("Empty input is given");
        }if (StartsdWith2){
             if(AccountNumberLength==7){
                 System.out.println("Valid 7-digit account number");
             }else {
                 System.out.println("Invalid 7-digit account number");
             }
        }
        if (StartsWIth5){
            if(AccountNumberLength==5){
                System.out.println("Valid 5 digit account number");
            }else{
                System.out.println("Invalid 5-digit account number");
            }
        }
        if(!StartsdWith2 && !StartsWIth5){
            System.out.println("Invalid Account Number");
        }





    }
}
