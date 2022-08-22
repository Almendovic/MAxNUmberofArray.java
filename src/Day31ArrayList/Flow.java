package Day31ArrayList;

import java.util.ArrayList;

public class Flow {
    public static void main(String[] args) {

        /*
        Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
         */


        ArrayList<String> heroes=new ArrayList<>();
        heroes.add("Iron man");
        heroes.add("Spider man");
        heroes.add("Thor");
        heroes.add("Captain America");
        heroes.add("Hawkeye");
        System.out.println("heroes = " + heroes); 
        heroes.remove(2);
        System.out.println("heroes = " + heroes);
        heroes.remove("Iron man");
        System.out.println("heroes = " + heroes);
        heroes.remove(0);
        System.out.println("heroes = " + heroes);





    }
}
