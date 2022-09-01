package day43Abstraction.Shape;

public class Square extends shape{

    public int side;



    public Square(String name) {
        super("Square");
        this.side=side;
    }

    @Override
    public void area() {
        System.out.println(side* side);
    }

    @Override
    public void perimeter() {
        System.out.println(4*side);
    }
}
