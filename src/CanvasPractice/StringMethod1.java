package CanvasPractice;

public class StringMethod1 {
    public static void main(String[] args) {

        String str ="Cydeo";// returns the char at given index, return ---->char
        // index: 01234
        char ch1=str.charAt(3);
        System.out.println(str.charAt(3) );
        System.out.println(ch1);

        System.out.println("----------------------------------");

        String str2="Wooden Spoon";//Length method
        System.out.println();

        int n1=str2.length();
        System.out.println(n1);
        int lastIndex= str2.length() -1;
        System.out.println(lastIndex);

        System.out.println("lastIndex = " + lastIndex);
        System.out.println("------------------------------------");
        String str3="JavA"; //toLowerCase(); returns to all lowercase version of String.
        str3= str3.toLowerCase();// cannot modify it
        System.out.println(str3);
        System.out.println("-----------------------------------"); // to Lowercase
        String str4 ="Java";
        str4=str4.toUpperCase();
        System.out.println(str4);
        System.out.println("-------------------------------------");// to Uppercase
        String str5 = "            java Programming Language       ";
        str5=str5.trim();
        System.out.println(str5);
        System.out.println("--------------------------------------");//Index Number
        String str6 = "Wooden Spoon";
        int indexNumberOfFirst0 =str6.indexOf("o");
        System.out.println("indexNumberOfFirst0 = " + indexNumberOfFirst0);
        int indexNumberOfSecond0 =str6.indexOf("od");
        System.out.println("indexNumberOfSecond = " + indexNumberOfSecond0);

        int indexNumberOfThirdO =str6.indexOf("oon");
        System.out.println("indexNumberOfThirdO = " + indexNumberOfThirdO);

        System.out.println("----------------------------------------");//lastIndex Number
        String str7 = "Wooden Spoon";
        int lastIndexNumber =str7.lastIndexOf("o");
        System.out.println("lastIndexNumber = " + lastIndexNumber);





    }
}
