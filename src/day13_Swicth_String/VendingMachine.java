package day13_Swicth_String;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Vending Machine. Select the menu you want to see: \n\tSnacks\n\tDrinks");
        String menu =input.next();

        switch(menu){

            case "Snacks":
                System.out.println("Pick the snack: \n1)Chips 2)Cookies 3)Pretzels 4)Candy");
                int snackOption =input.nextInt();

                if (snackOption == 1) {
                    System.out.println("Chips are selected");
                } else if (snackOption==2) {
                    System.out.println("Cookies are my favorite");
                } else if (snackOption==3) {
                    System.out.println("Pretzels dispensing");
                } else if (snackOption==4) {
                    System.out.println("Candy coming right up");
                }else{
                    System.out.println("Not a valid Item");
                }
                break;



            case"Drinks":
                System.out.println("Pick the drink : \n1)Coke 2)Water 3)Juice");
                int drinkOption=input.nextInt();
                if(drinkOption==1){
                    System.out.println("Coke is selected");

                } else if (drinkOption==2) {
                    System.out.println("Water is selected");

                } else if (drinkOption==3) {
                    System.out.println("Juice is selected");
                }else{
                    System.out.println("Not a valid Item");
                }
                break;


        }







    }
}
