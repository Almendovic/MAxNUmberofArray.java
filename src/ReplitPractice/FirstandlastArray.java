package ReplitPractice;

import java.util.Scanner;

public class FirstandlastArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        System.out.println(words[0].substring(0,1)+ words[0].substring(words[0].length()-1));
        System.out.println(words[1].substring(0,1)+ words[1].substring(words[1].length()-1));
        System.out.println(words[2].substring(0,1)+ words[2].substring(words[2].length()-1));
        System.out.println(words[3].substring(0,1)+ words[3].substring(words[3].length()-1));
        System.out.println(words[4].substring(0,1)+ words[4].substring(words[4].length()-1));




    }

}


