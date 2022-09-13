package day47Polymorphism;

import day43Abstraction.emloyee.*;
import day44Abstraction_Interface.animal.Animal;
import day44Abstraction_Interface.animal.Cat;
import day44Abstraction_Interface.animal.Dog;
import day45Abstraction.shape.Circle;
import day45Abstraction.shape.Cube;
import day45Abstraction.shape.Shape;
import day45Abstraction.shape.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

     //   Shape shape =(Shape) new Circle(4);// todo upcasting

        Shape shape2=new Circle(5);

        //Webdriver driver =(ChromeDriver) new ChromeDriver();

        Animal animal = new Dog("Max","Husky",'M',3,"Small","White");


        Dog dog=(Dog) animal;// todo down-casting / more than once

        System.out.println(animal.getName());
        System.out.println(dog.getName());

       (  (Dog)animal ).bark();// todo down-casting / only once

        Shape shape1= new Square(5);

        System.out.println(((Square) shape1).getSide());


        System.out.println("--------------------------------------------");



        Animal animal2= new Cat("Jim","Scotish",'M',3,"Small","Black");

     //  Cat cat =(Cat)animal2;

       // cat.meow();

        ((Cat) animal2).meow();

      //  ((Dog)animal2).bark();



        System.out.println("--------------------------------------------");

       Employee employee = new Tester("Ali", 30, 'M', 42, "Sdet", 1400000);

       ((Tester) employee).bugReport();

     //   ((Developer)employee).unitTest() ;

      //  Driver driver =(Driver) employee;
        Person person=(Person) employee;
        Teacher teacher=(Teacher) employee;

        System.out.println("---------------------------------------------");

        Shape s1= new Circle(10);
        s1.area();
        s1.perimeter();

     //   ((Cube)s1).volume();




    }
}
