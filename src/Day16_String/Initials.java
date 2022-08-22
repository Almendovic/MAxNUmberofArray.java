package Day16_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your First name");
        String firstName=input.next();
        System.out.println("Enter your last name");
        String lastName=input.next();

        String initials= " " +firstName.charAt(0) + lastName.charAt(0);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("Initials = " + initials.toUpperCase());










    }
}
