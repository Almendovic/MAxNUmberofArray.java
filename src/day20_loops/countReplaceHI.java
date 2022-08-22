package day20_loops;

public class countReplaceHI {

    public static void main(String[] args) {

        //counting how many times hi is in the String
        String s = "khkjvdfhdvkjdhvfkhifvfhidcdhi";

        // aprroach 1; loop and delete fist occurence each time

        int count = 0;

        while (s.contains("hi")) {
            System.out.println(s);
            count++;
            s = s.replaceFirst("hi", " ");


        }
        System.out.println(count);
        System.out.println("------------------------------");
        //approach 2 for loop to check one index at a time, but when there is an 'h' we will check another index
        String s2= "khkjvdfhdvkjdhvfkhifvfhidcdhivdfkjdfhidvdhifvdvfhih";
          int counnt2=0;

        for (int i = 0; i < s2.length()-1; i++) {

            if(s2.charAt(i)=='h' && s2.charAt(i+1)=='i'){ // h+i check next character
                counnt2++;
            }




        }
        System.out.println(counnt2);
        System.out.println("------------------------------");

        // approach 3

        String s3 = "khkjvdfhdvkjdhvfkhifvfhidcdhivdfkjdfhidvdhifvdvfhih";
        int count3=0;


        for (int i = 0; i < s3.length()-1; i++) {

            if(s3.substring(i,i+2).equals("hi")){
                count3++;
            }




        }
        System.out.println(count3);













    }


}



