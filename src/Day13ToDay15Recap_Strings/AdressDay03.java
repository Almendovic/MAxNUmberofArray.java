package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class AdressDay03 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your address");
        String address= input.nextLine().toUpperCase().trim();

        System.out.println(address);

        if(address.startsWith("500")){
            System.out.println("House is on n the right side");
        } else if (address.startsWith("600")) {
            System.out.println("House is on the left side");
        }
        if(address.contains("DR")|| address.contains("DRIVE")){
            System.out.println("We are on the Drive ");

        } else if (address.contains("LANE") || address.contains("LN")){
            System.out.println("We are on Lane");
        }else if (address.contains("AVE")){
            System.out.println("We are on Avenue");
        }

    }
}
