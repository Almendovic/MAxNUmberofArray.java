package day19_Loops;

import java.util.Scanner;

public class last3Characters {

    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your word");

        String word=input.nextLine();
        System.out.println("Enter  number");
        int num=input.nextInt();

        String result="";



        for (int i = 0; i < num ; i++) {

            result+= word.charAt(word.length()-1) + "";

        }

        System.out.println(word+result);


    }
}
