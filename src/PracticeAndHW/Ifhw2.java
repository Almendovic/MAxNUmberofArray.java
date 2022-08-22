package PracticeAndHW;

public class Ifhw2 {
    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 50;
        int num3 = 100;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest ");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is the biggest");

        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the biggest");
        }
    }
}
