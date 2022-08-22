package Day38GarbageCollectionAccessModifiers;

public class StaticBlock { //todo static block cannot run without main method
    public static void main(String[] args) {

        System.out.println("Main method");
    }

    static { // todo runs first only 1 time
        System.out.println("Static Block 1");
    }

    static { // todo runs first only 1 time
        System.out.println("Static Block 2");
    }
    static { // todo runs first only 1 time
        System.out.println("Static Block 3");
    }



}
