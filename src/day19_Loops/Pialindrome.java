package day19_Loops;

public class Pialindrome {
    public static void main(String[] args) {
        /*

        given a String determine if it is palindrome


         */

        String s = "racecar";
        String reverse = ""; //TODO length()-1 will read last character


        for (int i = s.length()-1; i >=0 ; i--) {// by using length()-1 allows me to find last index of String, that means we can use that index to read characters
            reverse+=s.charAt(i);// reverse=reverse +s.chatAt(i)
        }
        if(s.equals(reverse)){
            System.out.println("Palindrome: " + reverse);
        }else{
            System.out.println("Not Palindrome");
        }
        System.out.println(s.equals(reverse)? "Palindrome":"Not Palindrome");





        }


    }

