package Day13ToDay15Recap_Strings;

public class StringMethods2Day2 {
    public static void main(String[] args) {

        String word="java";
        System.out.println(word.startsWith("j"));//TODO StatsWith
        System.out.println(word.startsWith("ja"));
        System.out.println(word.startsWith("jae"));
        System.out.println("---------------------------------");

        System.out.println(word.endsWith("a"));//TODO Endswith
        System.out.println(word.endsWith("A"));//case sensitivity matters
        System.out.println(word.endsWith("java"));
        System.out.println(word.endsWith("va"));
        System.out.println(word.endsWith("va "));
        System.out.println("----------------------------------");


        boolean b=word.startsWith("java");
        System.out.println(b);
        System.out.println("--------------------------------");

        String str = "today is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains(today)) "+ str.contains("today"));
        System.out.println("str.contains(id)) "+ str.contains("is"));
        System.out.println("str.contains(degrees)) "+ str.contains("degrees"));
        System.out.println("str.contains(it 80)) "+ str.contains("it 80"));// contains (it) && contains(80) but not together
        System.out.println(str.contains("80") && str.contains("today"));
        System.out.println("str.contains(day)"+ str.contains("day"));
        System.out.println(str.indexOf("is"));
        System.out.println(str.length()-1);// to get last index subtract 1 character to get last index because index stars from 0









    }
}
