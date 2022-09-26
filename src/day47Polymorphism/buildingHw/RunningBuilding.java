package day47Polymorphism.buildingHw;

import java.util.ArrayList;

public class RunningBuilding {

    public static void main(String[] args) {

        Building[] buildings = {
                new House("Boston", 300_000, 3),
                new House("Manhattan", 800_000, 2),
                new Apartment("Edison", 1100_000, 4),
                new Apartment("Linden", 2500_000, 6),
                new OfficeBuilding("Brooklyn", 400_000, 30),
                new OfficeBuilding("Austin", 350_000, 12),
                new OfficeBuilding("Bronx", 900_000, 7),};


        ArrayList<Building> apartment = new ArrayList<>();

        ArrayList<Building> house = new ArrayList<>();

        ArrayList<Building> office = new ArrayList<>();


        for (Building each : buildings) {
            if (each instanceof Apartment) {
                apartment.add((Apartment) each);
            }
            if (each instanceof House) {
                house.add((House) each);
            }
            if (each instanceof OfficeBuilding) {
                office.add((OfficeBuilding) each);


            }



        }
        System.out.println("Apartment "+apartment);
        System.out.println("---------------------");
        System.out.println("House "+house);
        System.out.println("---------------------");
        System.out.println("Office "+office);

        System.out.println("-----------------------");
        System.out.println();

        BuildingUtil.search("Great Falls");

        System.out.println(BuildingUtil.search("Great Falls"));
        System.out.println(BuildingUtil.search("fairfax"));


    }




}
