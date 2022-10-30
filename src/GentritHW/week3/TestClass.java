package GentritHW.week3;

import GentritHW.week3.ArmStrongNumber;
import GentritHW.week3.PrimeNumber;
import GentritHW.week3.reverseInteger;

public class TestClass implements ArmStrongNumber, reverseInteger, PrimeNumber {
    public static void main(String[] args) {


        System.out.println("PrimeNumber = " + PrimeNumber.isPrime(12));


        System.out.println("reverseInteger.reverseInt = " + reverseInteger.reverseInt(-561));

    }
}
