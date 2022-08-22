package day19_Loops;

public class LoopWithString {
    public static void main(String[] args) {

        String s="october";
        System.out.print(s.charAt(0));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(3));
        System.out.println();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        



    }
}
