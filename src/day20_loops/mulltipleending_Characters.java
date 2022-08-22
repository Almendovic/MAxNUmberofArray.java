package day20_loops;

public class mulltipleending_Characters {

    public static void main(String[] args) {



        String str="hello";
        int end=3;


        for (int i = 0; i < end; i++) {
           str+=str.charAt(str.length()-1);// the characteers at teh last index


        }
        System.out.println(str);
    }
}
