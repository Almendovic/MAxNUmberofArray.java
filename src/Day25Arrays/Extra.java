package Day25Arrays;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {


        String[] str ={"hello","world","monday","java"};
        System.out.println(Arrays.toString(str));
        System.out.println(String.join("#",str));
        System.out.println(String.join(" ",str));
        System.out.println(String.join(" MIDDLE ",str));

         int[] aa=new int[]{1,5,2,5};// another syntax that exists to crate an array

        System.out.println(Arrays.toString(new int[]{3,5,2,6})); // creates array,prints,doeent have a refference to it after in the program



    }
}
