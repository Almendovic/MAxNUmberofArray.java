package Day37Static.car;

public class Car {

    String model;

    Driver driver;

    public Car(String model,String name,long licenseNumber,char licenseType){
        this.model=model;

      driver=  new Driver(name,licenseNumber,licenseType);



    }

    public Car(String model,Driver driver){

        this.model=model;
        this.driver=driver;

    }

}
