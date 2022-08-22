package Day30_practice_wrapper;

public class WrapperClassExample2 {
    public static void main(String[] args) {

        System.out.println("Byte Min: "+Byte.MIN_VALUE);
        System.out.println("BYte Max: "+Byte.MAX_VALUE);


        System.out.println("Integer Min:" +Integer.MIN_VALUE);
        System.out.println("Integer Max:" +Integer.MAX_VALUE);


        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isLetter('o'));
        System.out.println(Character.toUpperCase('e'));

        String s="123";
        System.out.println(s+5);
       int i =Integer.parseInt(s);
        System.out.println(i+5);

    }
}
