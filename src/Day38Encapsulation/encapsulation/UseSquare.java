package Day38Encapsulation.encapsulation;

public class UseSquare {
    public static void main(String[] args) {
        Square obj1 = new Square(5);
        System.out.println(obj1.getSide());
        System.out.println(obj1.calculateArea());
        System.out.println(obj1.calculatePerimeter());
        System.out.println(obj1);
        obj1.setSide(-2);
        System.out.println(obj1.getSide());
        System.out.println(obj1);


    }
}
