package day21_Loops;

import java.util.Scanner;

public class NestedLoppsPractice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        while (true){




            System.out.println("Enter your age");
            int age=scan.nextInt();

            while(!(age>=1 && age<=120)){// While the age is invalid
                System.err.println("Invalid entry,Please re-enter your age");
                age=scan.nextInt();

        }
            System.out.println("Would you like to continue?");
             String a =scan.next().toLowerCase();


             while (!(a.equals("yes")|| a.equals("no"))){ // While the age is invalid
                 System.out.println("Invalid Entry please re enter, Would you like to continue");
                 a=scan.next().toLowerCase();
             }

             if(a.equals("no")){
                 break;
             }

        }












    }
}
