package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class ValidWebsiteDay2 {
    /*
    declare s String for the website and check if it is valid
    website should start with: wwww.
    website should end with one of the following
    .com
    .edu
    .gov
    .net
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Website: ");

        String website =input.next();
        boolean startWith=website.startsWith("www.");
        boolean endsWith=website.endsWith(".com") ||website.endsWith("edu") || website.endsWith(".gov") || website.endsWith(".net");

        if (website.startsWith("www.") && website.endsWith(".com")) {
            System.out.println("Valid website");
        } else if (website.startsWith("www.") && website.endsWith(".edu")) {
            System.out.println("Valid website");
        } else if (website.startsWith("www.") && website.endsWith(".gov")) {
            System.out.println("Valid website");
        } else if (website.startsWith("www.") && website.endsWith(".net")) {
            System.out.println("Valid website");
        } else {
            System.out.println("Invalid website");

            if(!startWith){
                System.out.println("Website should start with: www.");
            }
            if(!endsWith){
                System.out.println("Website should end with: .com /.edu/.gov/.net");
            }
            System.out.println("---------------------------------");
            System.out.println(startWith&&endsWith?"valid website" :"invalid website");







       /* boolean validStart =website.startsWith("www.");
        boolean validEnd=website.endsWith(".com") || website.endsWith(".edu") ||website.endsWith(".gov")||website.endsWith(".net");


        if(validEnd && validEnd) {
            System.out.println(website + " is valid");

        }else{
            System.out.println(website + " invalid");

            if(!validStart){
                System.out.println("Website should start with www.");
            }
            if(!validEnd){
                System.out.println("Website should end with .com ot .edu or .gov or .net");

        */
            }



        }
    }


