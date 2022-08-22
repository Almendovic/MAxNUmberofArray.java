package Day27Methods;

public class FirstMethod {

    public  static void helloWorld(){
        System.out.println("Hello World!");

    }

    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World1");

        }
    }


    public static void main(String[] args) {
       helloWorld();
       helloWorld();
        System.out.println("---------------------------------");

       // print hello world 5 times
        for (int i=0;i<5;i++){
            helloWorld();
        }
        System.out.println("-------------------");

        helloWorld5Times();//print HW 5 times

        helloWorld5Times();//print HW 5 times
        helloWorld();
        helloWorld();

    }



}
