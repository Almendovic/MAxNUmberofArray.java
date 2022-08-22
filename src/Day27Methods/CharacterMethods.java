package Day27Methods;

public class CharacterMethods {

 public static void main(String[] args) {
    aToZ('A', 'Z');
    System.out.println();
    aToz('a', 'z');
    System.out.println();
    zToA('Z', 'A');
    System.out.println();
    zToa('z', 'a');
    System.out.println();
    zeroToNine(0,  9);
}

    public static void aToZ(char A, char Z) {
        for (char i = 'A'; i < 'Z' + 1; i++) {
            System.out.print((i) + " ");
        }
    }

    public static void aToz(char A, char Z) {
        for (char i = 'a'; i < 'z' + 1; i++) {
            System.out.print((i) + " ");
        }
    }

    public static void zToA(char Z, char A) {
        for (char j = 'Z'; j >= 'A'; j--) {
            System.out.print((j) + " ");
        }
    }

    public static void zToa(char Z, char A) {
        for (char j = 'z'; j >= 'a'; j--) {
            System.out.print((j) + " ");
        }
    }

    public static void zeroToNine(int x, int y) {
        for (int j = 0; j<= 9; j++) {
            System.out.print((j) + " ");
        }
    }
}



