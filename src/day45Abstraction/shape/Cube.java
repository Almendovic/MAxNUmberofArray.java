package day45Abstraction.shape;

public class Cube extends Shape {


    private double e;

    public Cube(double e) {
        super("Cube");
        setE(e);

    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        if (e <= 0) {
            throw new RuntimeException("Invalid edge " + e);
        }
        this.e = e;
    }

    @Override
    public double area() {
        return 6 * e * e;
    }

    @Override
    public double perimeter() {
        return 12 * e;
    }


        public double volume() {
            return e * e * e;
        }


}