package Day36CustomClassses.ConstrcutorCalls;

import java.util.Collections;

public class constructorCalls {


    public constructorCalls(){

        System.out.println("Default Constructor");
    }

    public constructorCalls(int a){

        this();//todo default consructor
        System.out.println("Constructor with int argument");


    }

    public constructorCalls(String  str){
        this(10);//default constructor

        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        constructorCalls obj1=new constructorCalls();

        System.out.println("-----------------------");

        constructorCalls obj2=new constructorCalls(10);

        System.out.println("-----------------------");

        constructorCalls obj3=new constructorCalls("Java");






    }








}
