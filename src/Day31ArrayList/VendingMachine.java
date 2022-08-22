package Day31ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

      /*  ArrayList<String > drinks=new ArrayList<>(); older approach
        drinks.add("Soda");
        drinks.add("Soda");
        drinks.add("Soda");
        drinks.add("Soda");
        drinks.add("Soda");
        System.out.println(drinks);
        */
        Scanner input=new Scanner(System.in);
        ArrayList<String>drinks=new ArrayList<>(Arrays.asList("Soda","Juice","Water","Coffee"));

        System.out.println("Welcome.Which drink would you like?");
        String selection=input.next();//

        if(drinks.contains(selection)){
            System.out.println(selection+ " is vending");
        }else{
            System.out.println(selection+ "is not in the vending machine");
        }





    }
}
