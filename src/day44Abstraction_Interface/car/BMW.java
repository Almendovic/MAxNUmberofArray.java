package day44Abstraction_Interface.car;

public class BMW extends Car{
    @Override
    public void start() {
        System.out.println("Pressing button to start");
    }
    /*
    Create a concrete class BMW
    subclass of Car

    override the start method to print:
        pressing button to start
     */
}