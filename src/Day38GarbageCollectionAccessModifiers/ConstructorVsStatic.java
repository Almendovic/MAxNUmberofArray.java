package Day38GarbageCollectionAccessModifiers;

public class ConstructorVsStatic {


    static {

        System.out.println("Static Block"); //todo allows to run main main method outside class
    }

    public ConstructorVsStatic(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new ConstructorVsStatic(); //1
        new ConstructorVsStatic(); //2
        new ConstructorVsStatic(); //3
        new ConstructorVsStatic(); //4
        new ConstructorVsStatic();//5

        System.out.println("Main Method");




    }


}
