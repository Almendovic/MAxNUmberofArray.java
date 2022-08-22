package day34CostumClasses.house;

public class House {

    String type;
    double squareFeet;
    int  numberOfBedrooms;
    int numberofBathrooms;
    boolean inCity;
    boolean hasGarage;


    public double calculateMorTgage(){

        if(numberOfBedrooms==2){

            return 1500;
        }else if(numberofBathrooms<4){
            return 2000;
        }else{
            return 2500;
        }



    }

    @Override
    /*public String toString() { //todo toString generation
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberofBathrooms=" + numberofBathrooms +
                ", inCity=" + inCity +
                ", hasGarage=" + hasGarage +
                '}';*/
    public String toString() { //todo toString generation
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberofBathrooms=" + numberofBathrooms +
               ","+ (inCity? "In the City":"In the suburbs")+
                "," +(hasGarage? " Has garage":"No garage. Street Parking");
    }
}
