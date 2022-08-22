package day13_Swicth_String;

public class StringObjects {
    public static void main(String[] args) {


        String s = "first";//String literal, in String Pool
        String s2 = new String("second"); // object in the heap
        System.out.println(s==s2);


        String s3 = new String("frist");
        System.out.println(s==s3);

        String s4 ="second";
        System.out.println(s4==s);

        String s5 ="first";
        System.out.println(s5==s);

        String s6="first";
        System.out.println(s6==s5);


    }
}
