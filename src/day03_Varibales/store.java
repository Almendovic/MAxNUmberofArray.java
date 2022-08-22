package day03_Varibales;

public class store {
    public static void main(String[] args) {//we write the code,compile adn than run

        int numberOfItems = 1000;
        System.out.println(numberOfItems + " in the store");//Concatenation combines the value of the numberOfItems variables with characters 'in the store'
        numberOfItems = 700;// reassignment 700 into the variable/updating
        System.out.println(numberOfItems + " after the sale");//top updates from top to button

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment);//soutv print variables shortcut

        double totalCost = 1_000_000.99;//10,000,000.99-. commas are not valid java syntax,only ( _ ad $ )
        System.out.println(totalCost);

        float f =19.99F;//adding letter f tell the compiler this a float number not a double number
        float f2 =100;// 100 int tpe by default, and int smaller than float, so there is no problem

        System.out.println(f);
        System.out.println(f2);

        //float f2 = 100.99F to convert from double to float

        long population = 8_000_000_000L;//by default its int up to 2billion,adding L will change from int to long
        System.out.println(population);
       long po2 =1_000_000;// L is not needed because 1 million is a valid number for int types,and that type can automaticly















    }






}
