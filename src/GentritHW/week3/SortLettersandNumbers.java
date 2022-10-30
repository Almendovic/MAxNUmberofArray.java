package GentritHW.week3;

import java.util.Arrays;

public interface SortLettersandNumbers {
    public static void main(String[] args) {
        System.out.println("SortLettersAndNumbersFromString(\"aaaaa223235654dfg\") = " + SortLettersAndNumbersFromString("aaaaa223235654dfg"));
    }
    public static String SortLettersAndNumbersFromString(String str) {
        String str2 = "";
        for(int i = 0; i < str.length(); i++) {
            str2 += ""+str.charAt(i); if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {
                if(Character.isDigit(str.charAt(i+1)) ) {
                    str2 +=",";
                }
            }
            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {
                if(Character.isAlphabetic(str.charAt(i+1))) {
                    str2+=",";
                }
            }
        }
        String[] arr = str2.split(","); str ="";
        for(String each: arr) {
            char[] chars=each.toCharArray(); Arrays.sort(chars);
            for(char eachChar: chars){
                str+=""+eachChar;
            }
        }
        return str;
    }
}