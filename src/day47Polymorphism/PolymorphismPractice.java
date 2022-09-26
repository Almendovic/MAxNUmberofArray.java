package day47Polymorphism;

import day40INheritance_MethodOveriding.CarTask.CARS.Car.BMW;
import day40INheritance_MethodOveriding.CarTask.CARS.Car.Car;
import day40INheritance_MethodOveriding.CarTask.CARS.Car.Tesla;
import day40INheritance_MethodOveriding.CarTask.CARS.Car.Toyota;

public class PolymorphismPractice {
    public static void main(String[] args) {


        Car[] cars = {new Toyota("Highlander", 2010, 25000, "White", 255000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2019, 35000, "blue", 23000),


        };

        Car carWithHighestMilage=cars[0],
                carWithLowestMileage= cars[0];

        for (Car eachCar : cars){
            if(eachCar.miles>carWithHighestMilage.miles){
                carWithHighestMilage= eachCar;
            }
        }
         for (Car eachCar : cars){
             if (eachCar.miles<carWithHighestMilage.miles){
                 carWithLowestMileage=eachCar;
             }
         }

        System.out.println(carWithHighestMilage);
        System.out.println(carWithLowestMileage);


    }
}
