package Day41exceptions.season;

import Day41exceptions.season.Season;

public class Summer extends Season {

    public Summer(double highestTemp, double lowestTemp) {
        super("Summer", highestTemp, lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}