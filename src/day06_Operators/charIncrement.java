package day06_Operators;

public class charIncrement {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter ++);
        System.out.println(letter ++);
        System.out.println(letter ++);
        System.out.println(letter ++);
        System.out.println();

        char letter2 ='a';
        System.out.println(++ letter2);// pre increment,so the 1 is added first,then expression finishes

        System.out.println(++ letter2);
        System.out.println(++ letter2);
        System.out.println(++ letter2);
        System.out.println();

        char digits = '9';// this a character not a digit,not a number 9
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits);// this is printing the character
        System.out.println((int)digits); //cast the character to an int ,which mean  that is prints the ASCII number for that character

        System.out.println(65);
        System.out.println((char)65);










    }
}
