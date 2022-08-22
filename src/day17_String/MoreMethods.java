package day17_String;

public class MoreMethods {
    public static void main(String[] args) {// TODO isEmpty()
          //is empty() checks for characters or not

        String s = "hello";
        System.out.println(s.isEmpty());//TODO isempty checks is there is no characters

        String s2= " ";//space char
        System.out.println(s2.isEmpty());

        String s3="";
        System.out.println(s3.isEmpty());
        System.out.println(s.isBlank());

        //isBlank()

        String a="    ";// spaces are characters   //TODO isBlank()
        System.out.println(a.isBlank());
        String c="";
        System.out.println(c.isEmpty());
        System.out.println(c.isBlank());
        //Replace()TODO Replace()
        String str="java";
        str=str.replace('v','a');
        System.out.println(str);

        String str2 ="an apple patch";
        System.out.println(str2.replace("a","(a)"));

        //common use case; delete spaces

        String str3="     multiple words here  ";

        str3.replace(" ","");
        System.out.println(str3.replace(" ",""));

        //remove only first TODO remove only first
        String z="wooden spoon";
        System.out.println(z.replace("o","-"));
        System.out.println(z.replaceFirst("o","-"));






    }
}
