package Day31ArrayList;

import java.util.ArrayList;

public class Characters {
    public static void main(String[] args) {



        /*

Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element


         */


        ArrayList<Character>letters=new ArrayList<>();

        letters.add('A');
        letters.add('L');
        letters.add('E');
        letters.add('N');
        for (Character each : letters) {
            System.out.print(each);
        }

    }
}
