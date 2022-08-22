package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class EmailDay3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Email");

        String email=input.nextLine();
        int indexofAt=email.indexOf('@');
        String name=email.substring(0,indexofAt);
        int indexofDot=email.indexOf('.');
        String domain=email.substring(indexofAt + 1,indexofDot);
        int extensionDot=email.indexOf('.')+1;
        String extension=email.substring(indexofDot+1);
        System.out.println(email);
        System.out.println("Name part: "+name);
        System.out.println("Domain part: "+domain);
        System.out.println("Entension: ."+extension);




    }
}
