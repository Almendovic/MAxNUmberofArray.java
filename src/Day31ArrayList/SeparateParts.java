package Day31ArrayList;

import java.util.ArrayList;

public class SeparateParts {
    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> specChars = new ArrayList<>();
        ArrayList<Character> nums = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                nums.add(str.charAt(i));
            } else if (Character.isUpperCase(str.charAt(i))) {
                letters.add(str.charAt(i));
            } else {
                specChars.add(str.charAt(i));
            }
        }
        System.out.println(specChars);
        System.out.println(nums);
        System.out.println(letters);
    }
}
