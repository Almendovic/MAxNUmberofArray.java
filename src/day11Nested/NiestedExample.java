package day11Nested;

public class NiestedExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println(1);

            if (b) {
                System.out.println(2);//when false and true no output
            }
        }

    }
}