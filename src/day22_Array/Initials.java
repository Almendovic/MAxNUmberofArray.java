package day22_Array;

public class Initials {
    public static void main(String[] args) {
       /*
       Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS

No loop yet

        */

         String [] str={"James Bond","Harry Potter","Tony Stark"};


        System.out.println(" "+str[0].charAt(0)+ str[0].charAt(6));
        System.out.println(" "+str[1].charAt(0)+ str[1].charAt(6));
        System.out.println(" "+str[2].charAt(0)+ str[2].charAt(5));

    }
}
