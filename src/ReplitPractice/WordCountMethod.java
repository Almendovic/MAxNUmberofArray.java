package ReplitPractice;

import java.util.Scanner;

public class WordCountMethod {


    public static int wordCount(String words) {
        // your code
        String[] arr=words.split(  " ");
            int count=0;
        for(int i =0;i<arr.length;i++){

            count++;
        }

      return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

}