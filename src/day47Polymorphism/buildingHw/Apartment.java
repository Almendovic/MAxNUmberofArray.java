package day47Polymorphism.buildingHw;

public class Apartment extends Building implements HasBalcony{

    int monthOfLease;


    public Apartment(String location, double price, int monthOfLease) {
        super(location, price);
        this.monthOfLease = monthOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying monthly lease");
    }

    @Override
    public void openBalcony() {
        System.out.println("Going to my Balcony");

    }

    @Override
    public String toString() {
        return "Appartment{" +
                "monthOfLease=" + monthOfLease +
                super.toString() +
                '}';
    }
}
