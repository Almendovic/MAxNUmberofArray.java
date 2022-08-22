package day05_ArithmeticOperators;

public class WithSmallerTypees {

    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 4;
        System.out.println( b1 + b2);


        //int b3=  b1 + b2; during the calculations the values are turned into INT so the result is int

        //solutions:
        int i = b1 +b2;
        byte b3= (byte)(b1+b2);//use parenthesis to convert from int to byte
        System.out.println(b3);


    }
}
