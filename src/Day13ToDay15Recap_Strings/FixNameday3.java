package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class FixNameday3 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your First Name ");
        String first=input.next().toLowerCase();
        System.out.println("Enter your Last Name");
        String last=input.next().toLowerCase();

        first=first.substring(0,1).toUpperCase() + first.substring(1);
        last=last.substring(0,1).toUpperCase() +last.substring(1);
        System.out.println(first);
        System.out.println(last);










    }
}
