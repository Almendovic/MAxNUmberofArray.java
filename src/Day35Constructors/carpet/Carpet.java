package Day35Constructors.carpet;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double  totalPrice;


     public Carpet(double inputWidth,double inputLength, double inputUnitPrice,boolean inputPersian){

         width=inputWidth;
         length=inputLength;
         unitPrice=inputUnitPrice;
         isPersian=inputPersian;
         calculatePrice();




     }

      public void calculatePrice(){
         totalPrice=width*length*unitPrice;

         if(isPersian){
             totalPrice+=200;
         }

      }



    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                "," + (isPersian?"Persian Carpet":"Regular")+" carpet"+
                ", totalPrice= $ " + totalPrice +
                '}';
    }
}
