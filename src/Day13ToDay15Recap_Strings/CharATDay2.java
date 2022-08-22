package Day13ToDay15Recap_Strings;

public class CharATDay2 {
    public static void main(String[] args) {

        String s ="java";
        //         0123
        System.out.println("First char "+ s.charAt(0));
        System.out.println("second char "+ s.charAt(1));
        System.out.println("Third char "+ s.charAt(2));
        System.out.println("Fourth char "+ s.charAt(3));
        System.out.println(s.lastIndexOf("v"));

        System.out.println("Length " + s.length());
        System.out.println("Last index " +3 );// length -1 -->4-1=3
        // reverse my string, hardcoded : goal is to see;avaj

        System.out.print(s.charAt(3));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println(""+ s.charAt(3)+s.charAt(2)+s.charAt(1)+s.charAt(0));//adittion put "" to make a string









    }
}
