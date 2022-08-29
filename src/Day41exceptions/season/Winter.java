package Day41exceptions.season;

import Day41exceptions.season.Season;

public class Winter extends Season {

    public Winter(double highestTemp, double lowestTemp) {
        super("Winter", highestTemp, lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
        System.out.println("Code java");
    }
}