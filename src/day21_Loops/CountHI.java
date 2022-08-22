package day21_Loops;

import java.util.Scanner;

public class CountHI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int count = 0;

        for(int i =0; i<str.length();i++){
            if(str.charAt(i)=='h' && str.charAt(i+1) == 'i'){
                count++;
            }



        }
        System.out.println(count);
    }
}
