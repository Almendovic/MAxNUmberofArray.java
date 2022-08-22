package ReplitPractice;

import java.util.Scanner;

public class MaxMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


    public static int max(int x, int y) {
         int biggest=0;
        if (x>y) {
            biggest=x;
        }  else  {
            biggest=y;


        }


         return biggest;
    }


}
