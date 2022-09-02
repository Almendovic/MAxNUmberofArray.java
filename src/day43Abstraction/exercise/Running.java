package day43Abstraction.exercise;

public class Running extends Exercise{

    @Override

    public void perform(){
        System.out.println("We are running");
    }


    @Override
    public void getCaloriesBurned(int minutes){
        System.out.println(minutes * 35);
    }




}
