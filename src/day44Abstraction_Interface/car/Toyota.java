package day44Abstraction_Interface.car;

public class Toyota extends Car{
    @Override
    public void start() {
        System.out.println("Turning key to start");
    }
    /*
    Create a concrete class Toyota
    subclass of Car

    override the start method to print:
        turning key to start
     */
}