package day17_String;

public class RelativeChecker {
    public static void main(String[] args) {

        String name="James Bond";
        String name1= "Jamie Bond";

        int indexOfSpace=name.lastIndexOf(' ');
        String lastname = name.substring(indexOfSpace +1 );

        if (name1.endsWith(lastname)) {
            System.out.println("Related");
        }else{
            System.out.println("Not Related");
        }
        System.out.println(name1.endsWith(lastname)? "Related":"Not Related" );









    }
}
