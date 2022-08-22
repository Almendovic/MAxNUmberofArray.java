package day39inheritance;

import Day36CustomClassses.ConstrcutorCalls.Test;

public class Pizza {

    /*create a class called Pizza

        - data:

            size (String), number of toppings

        - constructor

            - create a constructor that creates a Pizza object with the length and the width

            	call setters here

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects


     */


    private String size;
    private int numberOfToppings;

    public Pizza(String size, int numberOfToppings) {
        this.size = size;
        this.numberOfToppings = numberOfToppings;
    }


    
}
