package day09_IfStatements;

public class Letters {

    public static void main(String[] args) {

        char letter = 'j';

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is an upper case letter");

        }
        if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is an lower case letter");

        }
    }
}
