package day33ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    /*All Palindrome

Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye




     */

    public static void main(String[] args) {


        ArrayList<String>words=new ArrayList<>(Arrays.asList("Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo","Eye"));

        ArrayList<String>Palindrome=new ArrayList<>();

        for (String each : words) {
            String s="";
            for(int i =each.length()-1;i>=0;i--){
                s+=each.charAt(i);


            }      if(s.equalsIgnoreCase(each)){
                Palindrome.add(each);
            }


        } System.out.println(Palindrome);


    }

}
