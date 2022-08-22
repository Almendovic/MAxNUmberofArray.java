package Day37Static;

public class Executions {

    public static void main(String[] args) {


            new Executions();
         System.out.println(1);
            new Executions();


    }

    public Executions(){
        System.out.println(2);
    }

    static {

        System.out.println(3);

    }



}
