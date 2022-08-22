package day21_Loops;

public class NestedStop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {
                if(i%2==0)break;
                System.out.println(i+ " "+j);
            }

        }









    }
}
