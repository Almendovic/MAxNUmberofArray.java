package day43Abstraction.Shape;

public class Circle extends shape{

     public int radius;



    public Circle(int radius) {
        super( "Circle");
        this.radius=radius;
    }

    @Override
    public void area() {
        System.out.println(radius * radius * Math.PI);
    }

    @Override
    public void perimeter() {
        System.out.println(2 * radius * Math.PI);
    }
}
