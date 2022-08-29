package day40INheritance_MethodOveriding.CarTask.CARS;


public class Sport {
String  name;
int numOfPlayers;
boolean teamBased;


    public Sport(String name, int numOfPlayers, boolean teamBased) {
        this.name = name;
        this.numOfPlayers = numOfPlayers;
        this.teamBased = teamBased;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numOfPlayers=" + numOfPlayers +
                ", teamBased=" + teamBased +
                '}';
    }

    public static void main(String[] args) {
        Sport soccer=new Sport("Basketball",10,true);

        System.out.println(soccer);



    }
}













