package day13_Swicth_String;

public class StringEquals {
    public static void main(String[] args) {

        String s = "java";
        String s2 = "java";

        System.out.println(s==s2); // checks if they are the same object, the same location
        //but it does not cheks the value
        System.out.println(s.equals(s2));

        String s3=new String("java");
        System.out.println(s==s3);
        System.out.println(s.equals(s3));




    }
}
