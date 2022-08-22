package Day38GarbageCollectionAccessModifiers;

import Day35Constructors.Student;
import Day36CustomClassses.car.Car;
import Day37Static.Iphone;
import PracticeAndHW.String;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {



     /*  String str=null;// null is not an object , does not exist

        //System.out.println(str.toUpperCase());*/

/*
        String str="Wooden Spoon"; //after line 14 ,"Wooden Spoon" will be eligible for garbage collection
        str=null;
        System.out.println(str);*/


       Car car1=new Car("Toyota");


       car1=null;

        System.out.println(car1);

        System.out.println("-----------------------------------");

      /*  String language="Python";
          language=   "Java";

        System.out.println(language);*/

        System.out.println("-----------------------------------");


        ArrayList<Integer>list1 =new ArrayList<>();
        list1.add(100);
        ArrayList<Integer>list2=list1;
        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));

        System.out.println("-----------------------------------");

        Student student1=new Student("Tahir",30,'M','B',14);
        student1.grade='A';

        Student student2=student1;
        student2.name="Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-----------------------------------");







    }
}
