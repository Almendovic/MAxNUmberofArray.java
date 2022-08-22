package Day35Constructors;

public class PIzza {

    public char size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;

    public PIzza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;




    }

    public double calcCost(){
        double startingPrice=(size=='S')?10:(size=='M')?12:14;

        double totalPrice=startingPrice+(numberOfCheeseTopping+numberOfPepperoniTopping)*2;

        return totalPrice;



    }


    public String toString() {
        return "PIzza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $" + calcCost()+
                '}';
    }
}
