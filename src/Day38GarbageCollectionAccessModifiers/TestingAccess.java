package Day38GarbageCollectionAccessModifiers;

import Day38GarbageCollectionAccessModifiers.modifier.AccessModifiers;

public class TestingAccess {


    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
      //  System.out.println(obj.b);
        //System.out.println(obj.c); outside of class
    }
}





