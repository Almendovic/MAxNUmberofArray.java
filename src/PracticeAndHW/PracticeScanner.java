package PracticeAndHW;
import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary ");
        double salary = input.nextDouble();
        System.out.println("Enter hours");
        int hours = input.nextInt();
        double  hourlyRate = salary/(hours * 52);
        System.out.println("hourly rate equals = " + hourlyRate);










    }








}
