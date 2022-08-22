package day26MultiArray;

import java.util.Arrays;

public class ExampleOne {
    public static void main(String[] args) {

       char[]upperOne={'R','J','A'};
       char[]lower={'p','z','q','e'};
       char[]other={'4','#','*','$','&'};

       char[][] chars= new char[3][];// upper,lowe,other
        chars[0]=upperOne;//storing the upper char array as the first element of the 2nd array
        chars[1]=lower;
        chars[2]=other;
        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));

        System.out.println(Arrays.deepToString(chars));


    }
}
