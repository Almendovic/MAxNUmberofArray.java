package day22_Array;

public class AverageNumbers {
    public static void main(String[] args) {

        int[] numbers ={10,20,30,40,50,60};

        double sum = 0;// to get exact addition


        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }

        double averageNUmber=sum/numbers.length;

        System.out.println("averageNUmber = " + averageNUmber);
    }
}
