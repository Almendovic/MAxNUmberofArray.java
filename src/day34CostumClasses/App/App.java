package day34CostumClasses.App;

public class App { // TODO class

    String name;// TODO instance variables
    double version;
    boolean isFree;
    int ratings;

    public void update(){ // TODO method     , void is just to print
        System.out.println(name+ " is updating");
        version+=0.1;





    }

    public String toString(){ //Todo aplyes to every single obeject that we made

        return "Name: "+ name + " \nVersion:"+version+"\nis Free: "+isFree +" \nRatings: "+ratings;

    }




}
