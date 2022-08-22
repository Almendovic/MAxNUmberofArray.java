package day11Nested;

public class diver {
    public static void main(String[] args) {

        int tank = 90;
        String message = ""; //use empty space to declare

        if(tank > 90){
            message="Your tank is full";
        }else if (tank >=80){
            message="Still okay";
        } else if (tank >= 70) {
            message="Dont go too far";
        } else if (tank >= 60) {
            message ="Start to head back";
        }else if (tank >=50){
            message="Be careful now you at 50%";
        }
        System.out.println(message);


    }
}
