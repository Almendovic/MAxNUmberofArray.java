package Day13ToDay15Recap_Strings;

public class IndexOfExampleDay3 {
    public static void main(String[] args) {
        String s="lollipop";
        //        01234567
        System.out.println("index of l: " + s.indexOf('l'));
        System.out.println("last index of l: " + s.lastIndexOf('l'));

        System.out.println("index of i: " + s.indexOf('i'));
        System.out.println("last index of i: " + s.lastIndexOf('i'));

        System.out.println("index of p: " + s.indexOf('p'));
        System.out.println("last index of p: " + s.lastIndexOf('p'));

        System.out.println("index of e: " + s.indexOf('e'));
        System.out.println("index of P: " + s.indexOf('P'));
        System.out.println();
        System.out.println("index of pop: " + s.indexOf("pop"));// gives 5 because the sequence of "pop" starts with  at 5
    }
}
