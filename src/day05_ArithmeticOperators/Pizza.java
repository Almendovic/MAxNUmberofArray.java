package day05_ArithmeticOperators;

public class Pizza {
    public static void main(String[] args) {

        String type ="Cheese";;
        int pizzaSlices= 10;
        int people = 3;
        int slicesPerPerson= pizzaSlices/people;
        int lefoverslices= pizzaSlices % people;
       // System.out.println(people + " people are going to eat the " + type + " pizza, Every person will get " + slicesPerPerson +" slices and there will be " + lefoverslices + " left over");
        System.out.println(people +  " people are going to eat the "+ type +" pizza,Every person will "+ slicesPerPerson + " slices and there will be "+ lefoverslices + " left over");





    }
}
