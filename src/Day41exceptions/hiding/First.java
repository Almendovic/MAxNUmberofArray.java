package Day41exceptions.hiding;

public class First {


    public static void staticMethod(){

        System.out.println("Static method from First");
    }

    public void instanceMethodA(){
        staticMethod();
    }



}
