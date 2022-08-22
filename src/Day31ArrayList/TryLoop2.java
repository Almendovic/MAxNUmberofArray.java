package Day31ArrayList;

import java.util.ArrayList;

public class TryLoop2 {
    public static void main(String[] args) {

        /*
        Try to loop:

Create an ArrayList of Double elements
Fill the ArrayList with some values
Find the max element from the ArrayList
         */

        ArrayList<Double> numbers=new ArrayList<>();

        numbers.add(1.0);
        numbers.add(2.2);
        numbers.add(3.3);
        numbers.add(4.5);
        numbers.add(3.6);
        System.out.println("numbers = " + numbers);
         double max=numbers.get(0);

        for (Double each : numbers) {
            if(each>max)
            max=each;
        }
        System.out.println("max = " + max);



    }
}
