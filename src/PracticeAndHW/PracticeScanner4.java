package PracticeAndHW;
import java.util.Scanner;

public class PracticeScanner4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        boolean evenlyDivisible2 = number % 2 ==0,
                evenlyDivisible3 = number % 3==0 ,
                evenlyDivisible5 = number % 5==0 ;
        System.out.println(number + " is Divisible by 2: " + evenlyDivisible2);
        System.out.println(number + " is Divisible by 3: " + evenlyDivisible3);
        System.out.println(number + " is Divisible by 5: " + evenlyDivisible5);












    }








}
