package Day16_String;

import java.util.Locale;
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your address");
        String address= input.nextLine().toUpperCase().trim();


        /*
        at this point we read the address from the console made all teh characters upper case and removed all the extra spaces from beginning and the end
         */
        if(address.startsWith("500")){
            System.out.println("House is on the right side");
        } else if (address.startsWith("600")){
            System.out.println("House us on the left side");
        } 
        
        if(address.contains("Drive")){
            System.out.println("We are on drive");
        } else if (address.contains("LANE")) {
            System.out.println("We are on Lane");
        } else if (address.contains("AVE")) {
            System.out.println("We are on Avenue");
        }


    }
}
