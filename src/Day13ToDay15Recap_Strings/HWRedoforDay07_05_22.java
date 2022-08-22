package Day13ToDay15Recap_Strings;

public class HWRedoforDay07_05_22 {
    public static void main(String[] args) {


    /*
    Declare and assign a String
print the String in all uppercase format and
print the String in all lowercase format

     */


        String name = "Alen Medeubayev";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);

        System.out.println("------------------------------");

        /*Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password


         */
        String username="alen94";
        String password="Premiumsound1994!";

        if(password.length()>8){
            System.out.println("Valid Password");

        }else if(password.length()<8)
            System.out.println("Invalid password");
        }
    }

