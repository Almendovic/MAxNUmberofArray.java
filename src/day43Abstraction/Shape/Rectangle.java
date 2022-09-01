package day43Abstraction.Shape;

public class Rectangle extends shape{

    public int width ;
    public int length;


    public Rectangle( int width, int length) {
        super("Rectangle");
        this.width=width;
        this.length=length;
    }

    @Override
    public void area() {
        System.out.println("Area is equal "+ width* length);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is equal "+2*(width* length));
    }
}
