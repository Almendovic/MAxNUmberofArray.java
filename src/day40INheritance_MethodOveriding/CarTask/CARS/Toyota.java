package day40INheritance_MethodOveriding.CarTask.CARS;

import day40INheritance_MethodOveriding.CarTask.CARS.Car;

public class Toyota  extends Car {


    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);


    }



    public void reliable(){
        System.out.println(brand+" "+model+ " is reliable");
    }
}
