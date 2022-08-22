package day22_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
;
          String[] months ={"January","February","March","April","June","July","August","September","October","November","December"};
        System.out.println("Enter your month number");
        int num =input.nextInt();

           if(num>=1 && num<=12){
               System.out.println(months[num -1]); // to convert input # to index 1-12 instead 0-11

           }else{
               System.out.println("Invalid month number,Should be 1-12");
           }

        }
    }

