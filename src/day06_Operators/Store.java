package day06_Operators;

public class Store {

    public static void main(String[] args) {

        int numberOfItems = 0;
        double price =0.0;
        System.out.println("go and Pick up some coffee");
        System.out.println("Items in the card"+  ++numberOfItems );
        price += 3.55; //

        System.out.println("Go pick some milk");
        System.out.println("add 1 gallon of milk" + ++numberOfItems);
        System.out.println("add 1 gallon of milk" + ++numberOfItems);

        price+=5.99;// price=price + 5.99

        System.out.println("Your total is $ " + price); //short hand is a way of adding

        int java = 8;
        int testing = --java;//pre decrement
        System.out.println(java);// 8--> 7
        System.out.println(testing);// 7
        System.out.println();

        int x = 7;
        int y = --x;
        System.out.println(x); // 7 ->6
        System.out.println(y); // 7








    }





}
