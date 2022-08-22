package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class HWRedo_for07_07_22_LongestWithA {
    /*create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 String Digits");
        String input1=input.next();
        String input2=input.next();
        String input3=input.next();


        if(input1.length()>input2.length()&& input1.length()>input3.length()&&input1.contains("a")){
            System.out.println(input1+ " Is the longest word with a ");
        }else if (input2.length()>input1.length() && input2.length()>input3.length()&& input2.contains("a")){
            System.out.println(input2+ " Is the longest word with a ");
        }else if(input3.length()>input1.length() && input3.length()>input2.length()&& input3.contains("a")){
            System.out.println(input3+ " Is the longest word with a ");
        }
















    }
}
