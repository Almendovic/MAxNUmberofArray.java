package my_uttils;

import Day38GarbageCollectionAccessModifiers.modifier.AccessModifiers;

public class TestingAccessOutside {


    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
       // System.out.println(obj.b); outside of package
        //System.out.println(obj.c); outside of class
    }
}




