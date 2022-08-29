package day40INheritance_MethodOveriding.CarTask.CARS.Car;



public class ParkingLot {//todo parking lot has a relation
    public static void main(String[] args) {


        Toyota toyota =new Toyota("Camry",2019,18000,"Gray",123456);

        Tesla tesla=new Tesla("Model S",2022,94990,"Red",0);

        BMW bmw=new BMW("X5",2020,67350,"Black",120000);


        toyota.start();
        tesla.start();
        bmw.start();




    }
}
