package InterviewQuestions;

import java.util.Scanner;

public class CamelCase_ImportantInterviewQuestion {
    public static void main(String[] args) {


        /*
Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday

         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter multiple words");
        String str =input.nextLine();
        String camelCase= "";

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)==' '){
                //str.charAt(i+1);
              camelCase+= str.substring(i+1,i+2).toUpperCase();// gives one character after the space
                i++;
            }else{
                camelCase+=str.charAt(i);
            }




        }
        System.out.println(camelCase);














    }
}
