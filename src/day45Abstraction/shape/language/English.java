package day45Abstraction.shape.language;

public class English implements language {

    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void bye() {
        System.out.println("Bye");
    }
}
