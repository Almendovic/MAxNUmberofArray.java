package day17_String;

public class PrintLetter {
    public static void main(String[] args) {

        char first = 'A';


        while (first <= 'Z') {

            System.out.print(first++ +" ");


        }
        System.out.println();
        char backwords='z';
        while (backwords >='a'){
            System.out.print(backwords-- + " ");// use -- tp print backwords
        }
    }
}
