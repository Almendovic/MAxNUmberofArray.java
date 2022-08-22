package CanvasPractice;

public class StringMethod2 {
    public static void main(String[] args) {

        //replace,replacefirst,Substring,repeat= methods to cover

       String str1 ="Wooden Spoon";//1)
       str1=str1.replace("o","e");// Replacing all characters "o" with "e";
        System.out.println("str1 = " + str1);
        String sentence1 = "I love Java, Java is the best programming language";
         sentence1=sentence1.replace("Java","C#");// TODO: Replace word "java" with C#
        System.out.println("sentence1 = " + sentence1);
        sentence1=sentence1.replace("C#","Java");
        System.out.println(sentence1);
        System.out.println("-------------------------------------------");
        String str2 = "Wooden Spoon";//TODO : ReplaceFirst Method
        str2=str2.replaceFirst("o","e");
        System.out.println(str2);

        String sentence2 = "I love Java, Java is the best programming language";
        sentence2=sentence2.replaceFirst("Java","C#");
        System.out.println("sentence2 = " + sentence2);

        System.out.println("---------------------------------------------");
        String str3 = "Java Programming Language";//TODO: subString(begIndex)
        String result1=str3.substring(str3.indexOf("P"));// "Programming Language"
        System.out.println(result1);


        String result2=str3.substring(5,16); //TODO : includes only "Programming" ,ending index is excluded
        System.out.println(result2);

        String result3=str3.substring( str3.indexOf("P") , str3.lastIndexOf(" "));
        System.out.println(result3);

        String s1= "I love Java";
        String result4=s1.substring(2,5+1);
        System.out.println(result4);

        System.out.println("--------------------------------------------------------");
        String str4 = "Java";// TODO : repeat method, repeats string n numbers of times

        String r=str4.repeat(3);// "JavaJavaJava" added after JAVA 11 only
        System.out.println(r);











    }
}
