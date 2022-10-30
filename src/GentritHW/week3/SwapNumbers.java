package GentritHW.week3;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Enter first number 'a'");
        int a = input.nextInt();
        System.out.println("Enter second number 'b'");
        int b = input.nextInt();
        a=a+b;//30-60
        b=a-b; // 90-60=30
        a=a-b;  //90-30=60
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
 /*so we got A=10 and B=20.

    To swap both numbers we can use (-) and (+) in this case

        so we will assign A = A-B  ( 5-20) is (-15)
        now we have to assign B= A+B (-15 + 20) = 5 (the -10 came from the new A)
        and we assign A again A= B-A (5 -(-15))= 20 (- and -10 make +10)

        Now if you would print A and B it would give you A=20 and B=10

        it might look maybe a bit complicated at the first glance but once you get the idea how it works , it will get clearer.
*/