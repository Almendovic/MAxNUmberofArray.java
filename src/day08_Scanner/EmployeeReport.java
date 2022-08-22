package day08_Scanner;

import java.util.Scanner;

public class EmployeeReport {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter employee full name");
        String fullName = input.nextLine();
        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();
        System.out.println("What is your hourly rate ");
        double hourlyRate = input.nextDouble();

        System.out.println("What is the average number of hours in a week: ");
        int hours=input.nextInt();


        double salary = hours * 52 * hourlyRate;

        System.out.println("Where is the company HQ ");
        input.nextLine();
        String hqLocation = input.nextLine();
        System.out.println("Are you full time: true or false");
        boolean isFulltime =input.nextBoolean();

        String report = fullName+ " is a " + jobTitle +" she makes " + salary + "$ because she is full-time "+isFulltime+ " The HQ is located at " + hqLocation;
        System.out.println(report);






    }
}
