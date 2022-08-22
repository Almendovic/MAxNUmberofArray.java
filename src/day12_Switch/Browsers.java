package day12_Switch;

public class Browsers {
    public static void main(String[] args) {

       String browser = "Safari";


       switch (browser){
           case "chrome":
               System.out.println("opening google in chrome");
               break;
           case"firefox":
               System.out.println("opening google in firefox");
               break;
           case "Safari":
           case "safari":
               System.out.println("Special set up or apple computer");
               System.out.println("Opening in safari");
               break;


           default:
               System.out.println("Opening in chrome by default");
       }






    }

}
