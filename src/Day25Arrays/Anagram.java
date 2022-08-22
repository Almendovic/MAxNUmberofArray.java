package Day25Arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

      String word1="listen";
      String word2="silent";

      char[] first =word1.toCharArray();
      char[] seconds=word2.toCharArray();
      System.out.println(Arrays.toString(first));
      System.out.println(Arrays.toString(seconds));

      Arrays.sort(first);
      Arrays.sort(seconds);

      System.out.println(Arrays.toString(first));
      System.out.println(Arrays.toString(seconds));

      if(Arrays.equals(first,seconds)){
          System.out.println("Anagram");
      }else{
          System.out.println("Not Anagram");
      }
        System.out.println(Arrays.equals(first,seconds)?"Anagram":"Not Anagram");




    }
}
