package ReplitPractice;

import java.util.Scanner;

public class withoutFirst {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        /*
        Use String methods to modify the given word based on the following rules:
If word starts with or ends with x or X print the String without those x characters
If there is no x or X as the first or last character print the word untouched
         */
        boolean start=word.startsWith("x")||word.endsWith("X");
        boolean ends=word.endsWith("x")||word.endsWith("X");
        int l= word.length();

        if(start && ends){
            word = word.substring(1, l-1);
        }else if(start && !ends){
            word = word.substring(1);
        }else if(!start && ends){
            word = word.substring(0, l-1);
        }else if(!start && !ends){
            word = word;
        }
        System.out.println(word);




    }
}
