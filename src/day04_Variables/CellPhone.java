package day04_Variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand ="Iphone";//String uses multiple characters NON_Primitive
        String model = "Iphone Xr";
        String color = "Space Gray ";
        Double price = 1000.99;
        boolean hasCamera = true;
        int size = 512;
        char sim = 'A';
        System.out.println("\t\tPhone Information:\nBrand: "+ brand);
        System.out.println( model +  " in " +  color);
        System.out.println("With "  +  size+"gb the price is $ "+ price);
        System.out.println("sim type: " +sim + " and has a camera:" +hasCamera);
        //Information can be reused but message is not

        String report = "\tPhone information:\nBrand: "+ brand +
                     "\n" + model + " in " + color +
                     "\nWith \"  +  size+\"gb the price is $ "+ price+
                     "\nsim type: " + sim +"and has a camera:" + hasCamera;
        System.out.println(report);//reusing multiple times 




    }


}
