package day07_Scanner;
import java.util.Scanner;


public class ScannerPractice3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();//85 Enter
        input.nextLine();// put input to space between to print second line

        System.out.println("Enter your full name");
        String fullname = input.nextLine();//Enter will assigned as full name

        System.out.println("score = " + score);
        System.out.println("fullname = " + fullname);






    }
}
