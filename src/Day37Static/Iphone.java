package Day37Static;

public class Iphone {

    public static String brand="Apple";

    public String model;

    public double price;

    public static String OS ="IOS";

    public String color;

    public String size;

    public static String madeIn="China";

    public static boolean hasBattery=true;

    public static boolean hasTouchScreen=true;


   // public static void printModelAndPrice(){

      //  System.out.println(model); //todo static methods does not accept instances
   // }


    public static void printOperatingSystem(){ // todo static method
        System.out.println(OS); //todo if you have instance you have to create object but not for static
    }

    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }




}
