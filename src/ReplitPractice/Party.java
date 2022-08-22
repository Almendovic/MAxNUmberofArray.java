package ReplitPractice;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        /*
        Use a loop to create a guest list for the party. Ask the user to enter the name of the first guest, store the name into the guest list and ask if they want to enter another guest name.
        If the user says yes then ask them for the next guest's name and repeat the process
          If the user says no then stop asking for names and display the final guest list


Example Flows:


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the guests name");
        String name=input.nextLine();
        String answer=input.nextLine();


         String guestsList="";



        while ( name.equals("yes")) {
            guestsList+=name;
            System.out.println("Do you want to enter another guest's name?");
             if(name!=guestsList){

                 break;




             }
            System.out.println("Guests"+ guestsList);
        }
    }
}
