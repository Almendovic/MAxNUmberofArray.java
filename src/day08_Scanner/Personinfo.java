package day08_Scanner;

import java.util.Scanner;

public class Personinfo {

    /*ask for first name
    ask for last name
    ask for address

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();
        System.out.println("Please enter your last name ");
        String lastName = input.next();
        input.nextLine();// for to enter input
        System.out.println("Please enter your address");
        String address= input.nextLine();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);

        System.out.println("Today word of the day is: Java");







    }

}
