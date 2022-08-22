package InterviewQuestions;

import java.util.Arrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {

        String sentence ="I Love Java";


         String [] words=sentence.split(   " ");

         String reverse="";

        for (int i = words[2].length()-1; i >= 0; i--) {
            reverse+=words[2].charAt(i);
        }


        System.out.println(reverse);

        words[2]=reverse;
        System.out.println(Arrays.toString(words));

        for(String word:words){
            System.out.print(word+ " ");
        }





    }
}
