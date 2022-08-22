package day08_Scanner;

import java.util.Scanner;

public class Angels {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();
        double sum = angleOne + angleTwo + angleThree;
        boolean isTriangle = sum ==180;
        boolean isCircle = sum ==360;

        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);














    }


}
