package day19_Loops;

public class SecondWord {
    public static void main(String[] args) {
        /*
        Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java
         */
        String str="I love Java";
        //          012345678910
        String str1= " ";
        String a[]=str.split(" ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for(int i=a.length-1;i>=0;i--){

            System.out.print(a[i]+ " ");
        }

    }
}
