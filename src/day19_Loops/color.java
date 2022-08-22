package day19_Loops;

import java.util.Scanner;

public class color {
    public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
     int numofColors=0;
     String colors=" ";

     while (numofColors<3) {

         System.out.println("Enter the next color");
         String inputcolors=input.nextLine();

         if(!colors.contains(inputcolors)){
             colors+=" "+inputcolors;
             numofColors++;
         }

     }
        System.out.println(colors.trim());





    }
}
