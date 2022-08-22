package day07_Scanner;// import between package and class

import java.util.Scanner;//input,scanner,key,

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//how to make a Scanner variable/object
        System.out.println("Please enter a number");
        int number = input.nextInt();//avoid hard coding flexible way to run that numbers
        System.out.println("This is your number " + number);

















    }
}
