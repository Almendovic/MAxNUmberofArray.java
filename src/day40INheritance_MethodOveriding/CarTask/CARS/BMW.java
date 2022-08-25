package day40INheritance_MethodOveriding.CarTask.CARS;

public class BMW extends Car {


    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" is breaking down");
    }




}
