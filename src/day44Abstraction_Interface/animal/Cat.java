package day44Abstraction_Interface.animal;

import day44Abstraction_Interface.animal.Animal;

public final class Cat extends Animal implements Playable {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() { //todo overriding become mandatory
        System.out.println("");
    }

    public void meow() {
        System.out.println(getName() + " is meowing");
    }


    public void play() {
        System.out.println(getName() + " is playing with ball");


    }
}
