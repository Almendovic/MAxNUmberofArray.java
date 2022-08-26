package day40INheritance_MethodOveriding.CarTask.CARS.shape;


public class Square extends Shape{

    double side;

    public Square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    public double area(){
        return side * side;
    }

    @Override
    public double perimeter(){
        return side * 4;
    }

}
