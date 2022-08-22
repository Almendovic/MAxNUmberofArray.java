package ReplitPractice;

import java.util.Scanner;

public class next3 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number:");
        int num = inp.nextInt();

        next3(num);
    }

    // DO NOT TOUCH ABOVE:

   public static int next3(int num){

       int num1=num+1;
       int num2=num+2;
       int num3=num+3;


       System.out.println(num1+" "+num2+" "+num3);
       return num;
     }



}
