package day21_Loops;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                if (count > 1 && !unique.contains("" + str.charAt(i))) {// if the counter is 1 the character was only found one time, the character only matched itself
                    unique += str.charAt(i);
                }
            }
        }
        System.out.println(unique);

    }
}




