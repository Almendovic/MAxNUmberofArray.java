package day45Abstraction.shape.learning;

public class Desktop implements Mac{
    @Override
    public void turnOn() {
        System.out.println("Desktop is turning on");
    }
}
