package Day18Loops;

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");



        int count=input.nextInt();
        int sum=0;


        while (count>=0){
            sum+=count;
            count++;
            if(count<=-1){
                System.out.println("Negative number");
            }

        }
        System.out.println("The sum : "+sum);




    }
}
