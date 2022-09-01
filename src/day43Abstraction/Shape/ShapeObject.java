package day43Abstraction.Shape;

public class ShapeObject {
    public static void main(String[] args) {


 Circle circle =new Circle(30);

        System.out.println(circle);
        circle.area();
        circle.perimeter();

        System.out.println("-------------------------------");


      Rectangle rectangle=new Rectangle(45,70);
      rectangle.area();
      rectangle.perimeter();


    }
}
