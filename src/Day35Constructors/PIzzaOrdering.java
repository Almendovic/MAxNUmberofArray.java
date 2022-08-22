package Day35Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PIzzaOrdering {
    public static void main(String[] args) {

        ArrayList<PIzza>pizzas=new ArrayList<>();


        for (int i = 0; i < 100; i++) {

            PIzza small=new PIzza('S',2,3);
            PIzza medium=new PIzza('M',3,4);
            PIzza large=new PIzza('L',4,5);

            pizzas.addAll(Arrays.asList(small,medium,large));

        }
        System.out.println("Total number of pizza "+ pizzas.size());
        double totalPrice=0;


        for (PIzza pizza : pizzas) {
           totalPrice+= pizza.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);








    }
}
