package Day13ToDay15Recap_Strings;

public class RereaptAll_ClassesDay1 {
    public static void main(String[] args) {

        String item= "pen";
        String item2= new String("pen");// directly int heap
        System.out.println(item==item2);


        String item3= new String("pen");
        System.out.println(item2==item3);// compares the two objects
          // .equals compares the characters only,compare the value
        System.out.println(item.equals(item2));//TODO:Equals
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));
        System.out.println();
        System.out.println(item.equals("Pen")); //checks for exact characters
        System.out.println(item.equalsIgnoreCase("Pen"));// wil check only characters, ignores Case sensitivity TODO: EqualsIgnoreCase

        System.out.println("-------------------------------------");
        String username ="jamesbond";
        String password="BOND007";
        System.out.println(username.equals("jamesbond"));
        System.out.println(password.equals("bond007"));

        System.out.println("--------------------------------------");

        String day ="Tuesday";
        System.out.println(day.length());//counts how many characters there is TODO: Length
        String day2="Friday";
        int len=day2.length();
        System.out.println(len);

        String str ="  hello ";
        System.out.println(str.length());// prints how many characters the String has,not the String itself.
        System.out.println("--------------------------------------");
        String word="Summer";
        word=word.toUpperCase();//TODO: To Uppercase
        System.out.println(word);
        System.out.println(word);

        System.out.println("--------------------------------------");
        String sentence="hello my NaMe is";
        System.out.println(sentence.toLowerCase());// make a new String that was all lowercase,and then print it
        System.out.println(sentence);// print the original String becaue String is immutable
        String lowerVer = sentence.toLowerCase();// referencce to new object
        System.out.println(lowerVer);

        System.out.println("--------------------------------------");//TODO Trim
        String s = "              java            ";
        System.out.println(s.length());
        s=s.trim();
        System.out.println(s);
        System.out.println(s.length());

        String s2="    multiple words  ";
        System.out.println(s2.trim());
        System.out.println(s2);

        System.out.println(sentence.lastIndexOf("is"));













    }
}
