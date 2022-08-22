package Day31ArrayList;

import java.util.ArrayList;

public class AddMethods {
    public static void main(String[] args) {

        ArrayList<Character> letters=new ArrayList<>();// creates an empty ArrayList
        System.out.println(letters.size());
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('a');
        System.out.println(letters.size()); //number of elements->4
        System.out.println(letters);
        //letters.remove(0);
        System.out.println(letters);

        System.out.println();
        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));

        System.out.println(letters);

        letters.add(0,'i');
        System.out.println(letters);
        letters.add(3,'8');
        System.out.println(letters);



    }

}
