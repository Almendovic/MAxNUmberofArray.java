package Day41exceptions.season;

public class Season {


    String name;
    double highestTemp;
    double lowestTemp;

    public Season(String name, double highestTemp, double lowestTemp) {
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }

    public void activity(){
        System.out.println("GENERIC SEASON");
    }

    public String toString(){
        return name + " season with the highest temperature of " + highestTemp + " and a lowest temperature of " + lowestTemp;
    }
}
