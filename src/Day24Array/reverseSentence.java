package Day24Array;

import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args) {

        String str="Today is Friday.Have a good weekend!";

        //reverse: weekend! good a have Friday. is Today

        String[] words =str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse ="";

        for(int i = words.length-1;i >=0;i--){ // iterating number backwards, starting from last index to 0
            reverse+=words[i]+ " "; // reverse=reverse+ words[i] + " ";
        }
        System.out.println(reverse.trim().toUpperCase());





    }
}
