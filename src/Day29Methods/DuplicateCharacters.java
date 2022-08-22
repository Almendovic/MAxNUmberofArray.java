package Day29Methods;

import my_uttils.StringUtil;

public class DuplicateCharacters {

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

    public static void main(String[] args) {
        System.out.println(getDuplicateCharacters("AABCCDEEF"));
    }
}
