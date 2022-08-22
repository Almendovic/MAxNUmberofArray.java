package Day18Loops;

public class EvenandOdd {
    public static void main(String[] args) {


        int limit = 20;
        int count = 1;


        //printing all the even numbers. Go from 1 to limit

        while (count <= limit) {

            if (count % 2 == 0) {
                System.out.print(count + " ");

            }
            count++;// TODO run in the loop but not inside if Statement

        }
        System.out.println();
        //print all odd number

        int limit2 = 0;

        while (limit2 <= limit) {

            if (limit2 % 2 == 1) { // checks for odd !=0
                System.out.print(limit2 + " ");

            }
            limit2++;


        }


    }
}
