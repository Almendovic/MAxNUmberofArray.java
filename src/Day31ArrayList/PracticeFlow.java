package Day31ArrayList;

import ReplitPractice.Array;

import java.util.ArrayList;

public class PracticeFlow {
    public static void main(String[] args) {

        /*
        ractice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
         */


        ArrayList<String > list= new ArrayList<>();

        list.add("Hat");
        list.add("Shoes");

        System.out.println("list = " + list);
        list.add(1,"Jacket");
        System.out.println("list = " + list);
        list.add(0,"Towel");
        System.out.println("list = " + list);
        list.add(1,"Car");
        System.out.println("list = " + list);





    }
}
