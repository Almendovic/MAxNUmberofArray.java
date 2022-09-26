package day47Polymorphism.buildingHw;

public class BuildingUtil {
    public static double rent(Building obj){
        if(obj instanceof House){
            return 1500;
        } else if(obj instanceof Apartment){
            return 800;
        } else if(obj instanceof OfficeBuilding){
            return 2000;
        }
        return 0;
    }

    public static Building search(String location){
        if(location.equalsIgnoreCase("great falls")){
            return new House("Great Falls", 500_000, 4);
        } else if(location.equalsIgnoreCase("fairfax")){
            return new Apartment("FairFax", 250_000,6);
        } else if(location.equalsIgnoreCase("mclean")){
            return new OfficeBuilding("McLean", 2_000_000, 6);
        }
        return null;
    }
}