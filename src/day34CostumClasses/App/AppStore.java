package day34CostumClasses.App;

import day34CostumClasses.App.App;

public class AppStore {


    public static void main(String[] args) {

        App instagram=new App();
        instagram.name="Instagram";
        instagram.version=12.1;
        instagram.isFree=true;
        instagram.ratings=4;


        instagram.update();// TODO calling the instance method by the object/reference
/*
        System.out.println(instagram.name);
        System.out.println(instagram.version);
        System.out.println(instagram.isFree);
        System.out.println(instagram.ratings);*/
        System.out.println("-------------------------------------");

        System.out.println(instagram);// now that we wrote to String we can print the object

        System.out.println(instagram.toString());//todo this is not necessary because toString is automatically called



    }



}
