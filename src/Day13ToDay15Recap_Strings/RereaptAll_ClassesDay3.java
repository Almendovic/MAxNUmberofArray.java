package Day13ToDay15Recap_Strings;

public class RereaptAll_ClassesDay3 {
    public static void main(String[] args) {

        String word1 = "java";
        String word2 = "mouse";
        String word3 = "madagascar";

        String longestVariable = "";


        if (word1.contains("a") && word1.length() > longestVariable.length()) {
            longestVariable = word1;

        }
        if (word2.contains("a") && word2.length() > longestVariable.length()) {
            longestVariable = word2;

        }
        if(word3.contains("a")&& word3.length()> longestVariable.length()){
            longestVariable=word3;
        }
        System.out.println("longestVariable = " + longestVariable);

    }
}

