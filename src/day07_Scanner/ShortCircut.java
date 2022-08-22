package day07_Scanner;

public class ShortCircut {

    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);
        //System.out.println(5/0); you cannot divide by 0
        //System.out.println( true && 5/0 == 0);
        System.out.println(false && 5/0==0);// == gives result as a boolean



        System.out.println(true || false);//doesnt metter what the rest fo them are

        int count = 0;
        System.out.println(true|| count++ == 1);//this code is not executed
        System.out.println(count);
        //single & | program will run all of the code left to right no matter even if the result was known or not




    }
}
