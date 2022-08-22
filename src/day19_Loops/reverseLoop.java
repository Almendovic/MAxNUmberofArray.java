package day19_Loops;

import javax.xml.transform.sax.SAXSource;

public class reverseLoop {
    /*Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java

     */

    public static void main(String[] args) {


        String word = "I love java";
        String space = "";

        for (int i = 9; i < word.length() - 1; i++) {
            if (word.contains("love")) {
                space += word.replace("love", "evol");

            }
            System.out.println(word);
            System.out.println(space);


        }
    }
}




