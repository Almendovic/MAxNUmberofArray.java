package day40INheritance_MethodOveriding.CarTask.CARS.shape;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius=radius;
    }

    public double area(){
        return radius * radius *Math.PI;
    }

    @Override
    public double perimeter() {
      return 2*Math.PI*radius;
    }
}
