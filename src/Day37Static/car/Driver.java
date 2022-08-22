package Day37Static.car;

public class Driver {

    String name;
    long licenseNUmber;
    char licenseType;

    public Driver(String name,long licenseNUmber,char licenseType){
         this.name=name;
         this.licenseNUmber=licenseNUmber;
         this.licenseType=licenseType;




    }


    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNUmber=" + licenseNUmber +
                ", licenseType=" + licenseType +
                '}';
    }
}
