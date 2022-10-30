package GentritHW.week3;

public class FindTheUnique {

    public static void main(String[] args) {

        System.out.println("findTheUniqueCharacter(\"AAABBBCCCDEF\") = " + findTheUniqueCharacter("AAABBBCCCDEF"));

    }
        public static String findTheUniqueCharacter (String str){

            for (int i = 0; i < str.length(); i++) {
                if (str.contains(""+str.charAt(i))){
                    str=str.replaceAll(""+str.charAt(i),"");
                    }
                }
            return str;

            }

    }

   /* public static String Reverse(String str) {

        String reversed="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }

        return reversed;

    }*/