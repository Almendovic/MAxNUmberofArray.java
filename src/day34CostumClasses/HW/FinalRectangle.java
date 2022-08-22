package day34CostumClasses.HW;

public class FinalRectangle {
    public static void main(String[] args) {


        Rectangle rectangle1=new Rectangle();
        System.out.println(rectangle1);
        rectangle1.base=10;
        rectangle1.height=5;
        rectangle1.calculatePerimeter();
        rectangle1.calculateArea();
        System.out.println(rectangle1);



        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle1.calculateArea());


    }
}
