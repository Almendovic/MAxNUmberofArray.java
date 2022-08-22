package PracticeAndHW;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ifhw3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sales amount");
        int salesAmount = input.nextInt();

        if (salesAmount< 10_000){
            System.out.println("No Bonus");
        }
        if(salesAmount >= 10_000 && salesAmount <15_000){



        }
        if(salesAmount >= 15_000){
            System.out.println("Bonus of 7000");
        }






    }
}
