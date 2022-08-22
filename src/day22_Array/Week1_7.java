package day22_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Week1_7 {
    public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1-7 of Week");
        int num=input.nextInt();


        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        System.out.println(days[num-1]);

        }
    }

