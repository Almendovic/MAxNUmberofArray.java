package day12_Switch;

public class Soccer {
    public static void main(String[] args) {

        int minutes = 90;

        if(minutes >= 0 && minutes <= 90){
            // valid time

            if(minutes >= 75){
                System.out.println("just getting started");
            } else if(minutes >= 60){
                System.out.println("players are doing their best");
            } else if(minutes >= 30){
                System.out.println("middle of the game is going great");
            } else {
                System.out.println("the end of the same is approaching");
            }

        } else {

            if(minutes < 0){
                System.out.println("minutes cannot be a negative number");
            } else {
                System.out.println("games cannot be longer than 90 minutes");
            }
            //System.out.println(minutes<0 ? "minutes cannot be a negative number" : "games cannot be longer than 90 minutes");

        }




    }
}

