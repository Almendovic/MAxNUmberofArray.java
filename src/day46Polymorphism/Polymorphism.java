package day46Polymorphism;

import day43Abstraction.Shape.Rectangle;
import day43Abstraction.emloyee.*;
import day44Abstraction_Interface.animal.*;
import day45Abstraction.shape.Circle;
import day45Abstraction.shape.Shape;
import day45Abstraction.shape.Square;
import day45Abstraction.shape.Triangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Polymorphism {
    public static void main(String[] args) {


        String str= "Wooden Spoon";

        Integer n1=2;

        Double n2=5.5;

        Boolean r1=true;

        Object[]array={str,n1,n2,r1,new Circle(4),new Square(7)}; //todo cuz Object is parent class of all

        Employee tester = new Tester("Ali", 30, 'M', 42, "Sdet", 1400000);
        Employee developer = new Developer("Alex", 28, 'M', 45, "Developer", 150000);
        Employee teacher = new Teacher("Anna", 56, 'F', 67, "Teahcer", 20000);
        Employee driver = new Driver("JOhn", 78, 'M', 87, "Driver", 50000);


        ArrayList<Person>CydeoEmployees=new ArrayList<>();


        CydeoEmployees.add(tester);
        CydeoEmployees.add(developer);
        CydeoEmployees.add(teacher);
        CydeoEmployees.add(driver);

        System.out.println("----------------------------------");

            Employee employee =new Developer("Ali",30,'M',42,"SDET",1500000);
            employee.work();

        Animal animal = new Dog ("Max","Husky",'M',3,"Small","White");
        animal.drink();
        animal.eat();


        Playable animal2 = new Dog ("Max","Husky",'M',3,"Small","White");
        animal2.play();
        System.out.println(animal2.isFriendly);



       Animal animal3 = new Cat("Max","Husky",'M',3,"Small","White");

       animal3.eat();
       animal3.drink();


        Shape shape= new Circle(5);
        shape.area();
        shape.perimeter();

       // System.out.println(shape.geRadius);
        //System.out.println(shape.PI);

        boolean isSquare =shape instanceof Square;

        boolean isTriangle=shape instanceof Triangle;
        boolean isCircle=shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);



    }
}
