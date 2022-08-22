package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class InitialsDay03 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your First name");
        String firstname=input.next();
        System.out.println("Enter Your Last name");
        String lastName=input.next();

        String initials = "" + firstname.charAt(0) + lastName.charAt(0);// always put "" for charAt to concatenate
        initials=initials.toUpperCase();
        System.out.println("First name: "+ firstname);
        System.out.println("Last name: " + lastName);
        System.out.println("initials = " + initials);








    }
}
