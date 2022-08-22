package Day24Array;

import java.util.Arrays;

public class Reverseeachword {
    public static void main(String[] args) {


        String str = "Today is Friday.Have a good weekend!";

        //reverse: weekend! good a have Friday. is Today

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse = "";


        for (String eachWord : words) {// goes though one element at the time on the Array


            String eachReverse = "";

            for (int i = eachWord.length() - 1; i >= 0; i--) {
                eachReverse += eachWord.charAt(i);
            }
            reverse += eachReverse + " ";
        }
        System.out.println(reverse);

    }
}
