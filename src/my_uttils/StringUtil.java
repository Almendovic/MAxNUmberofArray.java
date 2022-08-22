package my_uttils;

public class StringUtil {

    /*
    This class will be used to create String utility methods
     */


    public static String reverse(String str){
        String reverse="";
        for(int i =str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
            return reverse;

    }
    //palindrome means the String is the same forwards and backwards


    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }


    public static String fixFormat(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }

    public static String camelCase(String str){
        String[] allWords=str.split(" ");
        String camelCase=allWords[0].toLowerCase();

        for(int i=1;i<allWords.length;i++){
            camelCase+=fixFormat(allWords[i]);
        }
        return camelCase;
    }
    public static int frequencyOfChar(String str,char letter){

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==letter){
                count++;
            }
        }
        return count;



    }
    public static String getDuplicateCharacters(String str) {
        String duplicate = "";
        for (int i = 0; i < str.length(); i++) {
            //str.charAt(i)--> give every character


            if(duplicate.contains(""+ str.charAt(i))){
                continue;
            }


            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));


            if (frequency > 1) {
                duplicate += str.charAt(i);
            }

        }
        return duplicate;


    }





}
