package Day36CustomClassses.food;

public class Food {

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
      //  this.name = name;
        //this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
       // this.name = name;
        this.quantity = quantity;

    }


    public boolean calculatePrice(){

        if(quantity==0|| unitPrice==0){
            return false;
        }
        totalPrice=unitPrice*quantity;
        return true;
    }

    public String toString(){

        String str="Name: "+name;

        if(quantity!=0){
            str+=" , qauntity: "+ quantity;
        }

        if (unitPrice !=0){
    str+=" , unit price: $"+unitPrice;
        }
        if(totalPrice !=0){
            str+= ", total price: $"+totalPrice;
        }
        return  str;
    }

}
