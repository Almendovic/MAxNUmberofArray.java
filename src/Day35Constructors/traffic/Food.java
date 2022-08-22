package Day35Constructors.traffic;

public class Food {
   /* create a class called Food
        - data:
    name, quantity, unit price, total price
        - constructor
            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here
        - method:
            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price
            - toString()
    print all the Food information
    Create a separate class to create and test the Food objects
     */
    String name;
    double quantity;
    double unitPrice;



    public Food(String name, double quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

    }

    public double calculatePrice(){
        double totalPrice = quantity * unitPrice;
        return totalPrice;
    }

    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=$" + unitPrice+
                ", totalPrice=$" + calculatePrice()+
                '}';
    }



}
