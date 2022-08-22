package Day13ToDay15Recap_Strings;

public class RereaptAll_ClassesDay2 {

    public static void main(String[] args) {

        String first = "Testing";
        first=first.toUpperCase();// reassigning the reference
        System.out.println(first);

        String second ="SOFT SKILLS";
        String Lower=second.toLowerCase();
        System.out.println(Lower);
        System.out.println(second);
        System.out.println(second.equalsIgnoreCase(Lower));

        String third="      hello world   ";
        System.out.println(third.length());
        System.out.println(third);
        third=third.trim();
        System.out.println(third.length());
        System.out.println(third);







    }
}
