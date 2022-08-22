package Day27Methods;

public class VoidMethod {


    /*Void Methods
------------------------------------------------------------------------

create a method that can print odd numbers between 1-100 in the
same line saperated by space

create a method that can print even numbers between 1-100 in the
same line saperated by space

     */
    public static void main(String[] args) {

        oddNum(0, 100);
        System.out.println("-----------------------------");

        evenNum(0, 100);


}

    public static void oddNum(int x, int y) {

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println("Odd numbers 0-100: " + (i));
        }
    }
        public static void evenNum ( int x, int y){

            for (int i = 1; i < 100; i++) {
                if (i % 2 == 0)

                    System.out.println("Even numbers 0-100: " + (i));
            }
        }







    }







