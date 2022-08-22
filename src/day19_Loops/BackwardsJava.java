package day19_Loops;

import kotlin.text.StringsKt;

public class BackwardsJava {
    public static void main(String[] args) {
        /*
        Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java
         */


        String word1 = "I ";
        String word2 = "love ";
        String word3 = "java.";
        String s ="I love java";


        for (int i = word2.length()-1 ; i >= 0; i--) {
            System.out.print(word2.charAt(i));
            word1 += word2.charAt(i);


        }

        System.out.println();
        System.out.println(s);
        System.out.print(word1 + " " + word3);
    }
}
