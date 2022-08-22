package Day24Array;

import java.util.Arrays;

public class StringMethodsArray {
    public static void main(String[] args) {

      String s="hello world";
      char[] letters =s.toCharArray();
        System.out.println(letters);// String uses array internally,so it prints as String
        System.out.println(Arrays.toString(letters));
        System.out.println(s.length());
        System.out.println(letters.length);

        System.out.println(letters[0]);


        for (char eachLetter:s.toCharArray()){ //: letters
            System.out.println(eachLetter);


        }
        System.out.println();

        String str="monday,tuesday,wednesday,thursday,friday,saturday,sunday";

        System.out.println(Arrays.toString(str.split(",")));

        for(String eachDay: str.split(",")){
            System.out.println(eachDay);
        }

        String str2 ="jan-feb-march-may-apr-jun-jul-aug-sep-oct-now-dec";

        String[] months=str2.split("-");
        System.out.println();

        for (String eachMonth:months){
            System.out.println(eachMonth);
        }

        String str3="mississippi";
        System.out.println(Arrays.toString(str3.split("si")));

        String str4="java";
        System.out.println(Arrays.toString(str4.toCharArray()));// char[]
        System.out.println(Arrays.toString(str4.split("")));// String[]

    }
}
