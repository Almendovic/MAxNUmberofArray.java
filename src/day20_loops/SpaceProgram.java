package day20_loops;

public class SpaceProgram {
    public static void main(String[] args) {


        String s = "java hello";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (letter == ' ') {
                result += letter+ "_ ";
            } else {
                result += letter+ " ";


            }




        }
        System.out.println(result.trim());
    }
}
/*
String result =""// h
int i=0
charAt(i) -> charAt(0)

 */