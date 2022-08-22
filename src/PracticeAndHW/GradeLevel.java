package PracticeAndHW;

import java.util.Scanner;

public class GradeLevel {
    /*

Create a class called GradeLevel, Given a number grade level
determine and print which school type someone is in.
grade level and types are:

	any number less than 1 or more than 18 is not valid
	1-5: Elementary school
	6-8: Middle school
	9-12: High school
	13-16: College
	17-18: Grad School
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1-18");
        int grade = input.nextInt();
        if (grade >= 1 && grade <= 5) {
            System.out.println("Elementary school");
        } else if (grade >= 6 && grade <= 8) {

            System.out.println("Middle school");

        } else if (grade >= 9 && grade <= 12) {
            System.out.println("High School");

        } else if (grade >= 13 && grade <= 16) {
            System.out.println("College");

        } else if (grade >= 17 && grade <= 18) {
            System.out.println("Grad school");


            System.out.println("type of school:" + grade);
        }else{



            System.out.println("Not valid");
        }
    }
}









