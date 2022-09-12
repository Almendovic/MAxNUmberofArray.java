package day44Abstraction_Interface.car;
public class Runner {
    public static void main(String[] args) {

        Toyota car1 = new Toyota();
        car1.start();

        BMW car2 = new BMW();
        car2.start();

        Tesla car3 = new Tesla();
        car3.charge();
        car3.start();



    }
}