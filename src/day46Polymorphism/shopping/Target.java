package day46Polymorphism.shopping;

import day46Polymorphism.shopping.Shopping;

public final class Target extends Shopping {
    @Override
    public void buyItem() {
        //System.out.println("is buying item at Target");
    }

    @Override
    public void returnItem() {
        //System.out.println("Is returning the item at Target");
    }
}
