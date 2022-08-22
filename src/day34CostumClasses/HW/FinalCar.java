package day34CostumClasses.HW;

public class FinalCar {
    public static void main(String[] args) {


        Car car1=new Car();
        car1.model="BMW 3 series";
        car1.year=2022;
        car1.color="Black";
        car1.fuel_level=24;

        System.out.println(car1);
        System.out.println(car1.drive());
        System.out.println(car1.fillTank());
        System.out.println(car1.LowFuel());







    }
}
