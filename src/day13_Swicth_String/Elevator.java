package day13_Swicth_String;

public class Elevator {
    public static void main(String[] args) {

        int floor = 8;
        String companies;


        switch (floor) {
            case 1:
                companies = "Lobby,Starbucks,Amazon Pick Up";
                break;
            case 2:
                companies = "NASA,Cydeo,Discover";
                break;
            case 3:
                companies = "Uber,Lyft,Chase";
                break;
            case 4:
                companies = "Rooftop, Lounge";
                break;
            default:
                companies = "Invalid Floor Selected";


        }
        System.out.println("Floor " +floor + " : " + companies);
    }
}
