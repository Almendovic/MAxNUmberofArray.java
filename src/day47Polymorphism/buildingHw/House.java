package day47Polymorphism.buildingHw;

public class House extends Building implements  HasBackyard,HasBalcony,HasElevator{

     public int numberOfResidents;


    public House(String location, double price,int numberOfResidents) {
        super(location, price);
        this.numberOfResidents=numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying for House");
    }

    @Override
    public void mowLawn() {
        System.out.println("Lawning the backyard");
    }

    @Override
    public void openBalcony() {
        System.out.println("going to Balcony");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("Using elevator");
    }


    @Override
    public String toString() {
        return "House{" +
                super.toString()+
                "numberOfResidents=" + numberOfResidents +
                '}';
    }
}
