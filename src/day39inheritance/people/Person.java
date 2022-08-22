package day39inheritance.people;

import java.security.PublicKey;

public class Person {



    String name;
    int age;

    public Person(String name, int age) {
        //super(); todo calls the parent constructor
        this.name = name;
        this.age = age;
    }
}
