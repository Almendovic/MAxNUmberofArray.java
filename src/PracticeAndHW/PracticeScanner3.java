package PracticeAndHW;
import java.util.Scanner;

public class PracticeScanner3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a price: ");
        int price = input.nextInt();

        System.out.println("Enter quantity");
        int quantity= input.nextInt();

        System.out.println("The revenue = :"+ price * quantity);








    }

}
