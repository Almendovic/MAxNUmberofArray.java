package day34CostumClasses.HW;

public class Car {

/*reate instance variables:
    model, year, color, fuel level (percent number)

create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

Create a separate class to create Car objects and test the methods created

 */


    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuel_level=" + fuel_level +
                '}';
    }

    String model;
    int year;
    String color;
    double fuel_level;



    public double drive(){


        System.out.println("Driving model: " +model);
        System.out.println("Fuel level is : " + (fuel_level-=5));


        return fuel_level;





    }
    public double fillTank(){

        System.out.println("Filling Tank");
        System.out.println("Fuel level is  " +(fuel_level=100));



      return fuel_level;
    }

    public boolean LowFuel(){

        if(fuel_level<=25) {

            return true;
        }else{
            return false;
        }

    }







}
