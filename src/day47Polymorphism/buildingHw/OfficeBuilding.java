package day47Polymorphism.buildingHw;

public class OfficeBuilding extends Building implements  HasElevator{

     int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying for Office");

    }

    @Override
    public void elevator(int floor) {
        System.out.println("Using an Elevator");
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "numberOfFloors=" + numberOfFloors +
                super.toString()+
                '}';
    }
}
