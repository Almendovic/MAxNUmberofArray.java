package Day27Methods;

public class Parameter {

    public static void greeting(String name){// name is the parameter
        System.out.println("hello "+ name);
        System.out.println("Nice tomee you "+ name);


    }
    public static void age(int birthYear){
        System.out.println("You are "+(2022-birthYear) +" years old");

    }
    public static void main(String[] args) {

        greeting("James");// James is an argument, value of the name for method
        greeting("Kelly");// Kelly is an argument, value of the name for method
        age(1994);
        age(2000);

    }



}
