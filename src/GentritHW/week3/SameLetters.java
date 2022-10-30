package GentritHW.week3;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println("sameChars(\"abc\",\"bca\") = " + sameChars("abc", "bca"));


    }
      static boolean sameChars(String fitstStr, String secondStr){
        if(fitstStr.length()!=secondStr.length()){
            return false;
        }
        char[] first = fitstStr.toCharArray();
        char[] second=secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return  Arrays.equals(first,second);


    }
}



