package day34CostumClasses.house;

import day34CostumClasses.house.House;

public class Market {
    public static void main(String[] args) {

        House house1=new House();
        System.out.println(house1);

        house1.type="Townhouse";
        house1.squareFeet=1300;
        house1.numberofBathrooms=2;
        house1.numberOfBedrooms=3;
        house1.inCity=false;
        house1.hasGarage=true;

        System.out.println(house1);// dont need to call toString

        System.out.println(house1.calculateMorTgage());










    }
}
