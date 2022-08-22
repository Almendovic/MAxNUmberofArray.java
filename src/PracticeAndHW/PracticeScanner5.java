package PracticeAndHW;
import java.util.Scanner;

public class PracticeScanner5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int  angel, angel2, angel3;




        System.out.println("Enter Angel 1: ");
        angel =input.nextInt();
        System.out.println("Enter Angle 2 : ");
        angel2 = input.nextInt();
        System.out.println("Enter Angle 3: ");
        angel3 = input.nextInt();
        boolean isTriangle =(angel+angel2+angel3)==180;
        System.out.println("This is Triangle = 180 " + isTriangle);
        boolean isCircle =(angel + angel2 + angel3)==360;
        System.out.println("This is Circle = 360 " + isCircle);





    }

}
