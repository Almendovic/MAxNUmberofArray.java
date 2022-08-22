package day19_Loops;

import java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");

        String word1=input.nextLine();
        String wordWithSpace="";

        for (int i = 0; i < word1.length(); i++) {


            if(word1.charAt(i)==' '){
                wordWithSpace+=word1.charAt(i);

            }
               wordWithSpace+=word1.charAt(i)+ " ";
               word1=word1.replace(' ','_');







        }
        System.out.println(wordWithSpace);






    }
}
