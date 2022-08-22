package day14_String;

import java.util.Locale;

public class StringMethodsOne {
    public static void main(String[] args) {

        String item ="pen";
        String item2=new String("pen");
        System.out.println(item==item2);//checks if the same object item is the same object as item2

        String item3=new String("pen");
        System.out.println(item2==item3);


        System.out.println(item.equals(item2));
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));
        System.out.println(item.equals("Pen"));
        System.out.println(item.equalsIgnoreCase("Pen"));// check only matching characters and ignores all the cases

        System.out.println("_-----------------------------");
        String username ="jamesbond";
        String password = "BOND007";
        System.out.println(username.equals("jamesbond"));
        System.out.println(password.equals("bond007"));
        System.out.println("-------------------------------");

        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println(password.equalsIgnoreCase("BOND007"));
        System.out.println("--------------------------------");

        String day= "Tuesday";
        System.out.println(day.length());// counts how many characters there is
        String day2 ="Friday";
        int len =day.length();// length() method gives back int type, so we can use it however we want
        System.out.println(len);

        String str = "hello  ";// the character 'hello' 5 long but spaces are also character, so the space in the beginning and the end are included, which means the total length is 7
        System.out.println(str.length());// prints how many characters the string has, not the String
        System.out.println("------------------------------------");

        String word= "Summer";
        word.toUpperCase();// the uppercase method makes all characters uppercase, but we didnt do anything with this value
        System.out.println(word);
        word= word.toUpperCase();//this time we make everything uppercase, then String it gives us back (all uppercase) was reassigned int the variable
        System.out.println(word);
        System.out.println(word);

        System.out.println("-------------------------------------------");

        String sentence = "Hello my nAME is";
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence); // This will print the original because String is immutable it cannot change
        String lowerVer=sentence.toLowerCase();
        System.out.println(lowerVer);// option reassign
        // sentence =sentence.toLowercase();
        System.out.println("------------------------------");

        String s= "            java             ";
        System.out.println(s.length());
        s = s.trim(); //trim() method gets rid of all the extra spaces in the beginning and end of a String
        System.out.println(s);
        System.out.println(s.length());

        String s2 = "   multiple words here    ";
        System.out.println(s2.trim());// trim() will remove from the beginning and edn will not be touched













    }
}
