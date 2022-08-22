package Day28Methods;

public class CharMethods {

    public static void main(String[] args) {

        getLowerAtoZ();
        getLowerZtoA();
        getUpperAtoZ();
        getUpperZtoA();
        getNumber0to9();

    }


    public static void getUpperAtoZ() {

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getLowerAtoZ() {

        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();


    }

    public static void getUpperZtoA() {

        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getLowerZtoA() {

        for (char letter = 'z'; letter >= 'a'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println();

    }

    public static void getNumber0to9() {

        for (char letter = '0'; letter <= '9'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }
}
