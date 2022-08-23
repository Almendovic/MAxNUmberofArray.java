package day39inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","black");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("Mimi","Short Hair",'F',3,"Small","white");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger=new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Orange");
        tiger.eat();
        tiger.sleep();
        tiger.move();


        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);






    }
}
