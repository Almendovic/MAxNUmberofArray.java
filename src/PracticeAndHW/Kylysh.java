import java.util.*;

class Main {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW

        Scanner input=new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item=input.nextLine();
        int GiftCardBalance =100;
        int price = 0;





        switch (item){
            case "Blanket":
                price=60;
                System.out.println("Thank you for your purchase!" );
                System.out.println("Your current balance is: " + (GiftCardBalance - price) + "$");
                break;
            case  "Charger":
                price=5;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (GiftCardBalance - price)+ "$" );
                break;
            case  "Hat":
                price=25;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+ (GiftCardBalance - price)+ "$" );
                break;
            case  "Headphones":
                price=30;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (GiftCardBalance - price)+ "$" );
                break;
            case  "Laptop":
                price=200;
                System.out.println("Sorry, not enough funds on your gift card");

                break;
            case  "Pants":
                price=50;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (GiftCardBalance - price)+ "$" );
                break;
            case  "Pillow":
                price=40;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (GiftCardBalance - price)+ "$" );
                break;
            case  "Smartphone":
                price=1000;
                System.out.println("Sorry, not enough funds on your gift card");
                break;
            case  "Socks":
                price=5;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (GiftCardBalance - price)+ "$" );
                break;
            case  "USB cable":
                price=10;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (GiftCardBalance - price)+ "$" );
                break;
            default:
                System.out.println("Sorry, that is an invalid item");


        }
    }
}