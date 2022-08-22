package ReplitPractice;

import java.util.Scanner;

public class Eachletter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

           String word2="";

        for (int i = 0; i < word.length(); i++) {
               if(word.charAt(i)=='a'){
                   word2+=word.charAt(i);
               } else if (word.charAt(i)=='e') {
                   word2+=word.charAt(i);
               }else if (word.charAt(i)=='i'){
                   word2+=word.charAt(i);

               } else if (word.charAt(i)=='o') {
                   word2+=word.charAt(i);
               } else if (word.charAt(i)=='u') {
                   word2+=word.charAt(i);
               }
        }
        System.out.println(word2);






    }
}
