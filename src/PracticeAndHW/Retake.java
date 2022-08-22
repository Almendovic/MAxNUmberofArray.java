package PracticeAndHW;

import java.util.Scanner;

public class Retake {
    /*
    create a class Retake

    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

        If its the first attempt -> subtract 10%
        If its the second attempt -> subtract 20%
        If its the third attempt -> subtract 35%

    Based on the retake attempt number calculate the final grade

     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your grade");
        int score =0;
        score =input.nextInt();
        System.out.println("Enter you attempt number");
        int attemp =input.nextInt();


        if (attemp==1) {
            score-=score/100*10;

        }else if (attemp==2){
            score-=score/100*20;

        }else if (attemp==3){
            score-=score/100*35;
        }else{
            System.out.println("Fail");
        }
        System.out.println(score);


    }

}

