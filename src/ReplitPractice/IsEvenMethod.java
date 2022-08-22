package ReplitPractice;

import java.util.Scanner;

public class IsEvenMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }


    public static boolean isEven(int num){

      if(num%2==0){

          return true;
      }
      if(num%2==1){

          return false;
      }



       return isEven(num);
    }
}
