package PracticeAndHW;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Diver {
    /*create a class Diver

You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%


     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter you oxygen level");
        int OxygenLevel=input.nextInt();


        if(OxygenLevel >=90){
            System.out.println("Your tank is full");
        } else if (OxygenLevel>=80) {
            System.out.println("Still okay");

        } else if (OxygenLevel >=70) {
            System.out.println("Dont go too far");

        }else if (OxygenLevel >=60){
            System.out.println("Start to head back");
        } else if (OxygenLevel >= 50) {
            System.out.println("Be careful now you at 50 %");

        }else{
            System.out.println("YOU ARE PROBABLY DEAD MATE!");
        }


    }
}
