package day17_String;

import java.util.Scanner;

public class paint {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String storedcolors= " ";

        int counter=0;
        while (counter++<3) {

            System.out.println("Enter a color");
            String colorentered=input.nextLine();

            if (storedcolors.contains(colorentered) ) {
                System.out.println("Please enter a unique color");
                counter--;
            }else{
                storedcolors+=colorentered+ " ";
            }
        }
        System.out.println(storedcolors);



    }
}
