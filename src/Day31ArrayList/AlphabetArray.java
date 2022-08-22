package Day31ArrayList;

import java.util.ArrayList;

public class AlphabetArray {
    public static void main(String[] args) {


/*
Create an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters

Manually remove each vowels and print the new ArrayList


 */


        ArrayList<Character>letters =new ArrayList<>();

         for(int i ='a';i<='z';i++){
             letters.add((char)(i));
         }
        System.out.println("letters = " + letters);
         letters.remove((Character)'a' );
        letters.remove((Character)'e' );
        letters.remove((Character)'i' );
        letters.remove((Character)'o' );
        letters.remove((Character)'u' );
        letters.remove((Character)'y' );
        System.out.println("letters = " + letters);


    }
}
