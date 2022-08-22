package day11Nested;

public class amazon {

    public static void main(String[] args) {

        double price = 30.99;
        boolean isPrime = false;

        if (isPrime) {
            System.out.println("Free 2 day Shipping");
        } else {
            // you dont have prime
            if (price >= 25) {
                System.out.println("Free shipping available");
            } else {
                System.out.println("Shipping cost $2.99");
            }
        }
        /*
        if the boolean IsPrime is true the blocks runs
        if the boolean IsPrime is false blcol,which has a if satement
        that if condition is checked
        Price >= 25: free shipping
        false: pay for shipping
         */


    }
}
