package day46Polymorphism.shopping;

public final class Ebay extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void uploadProduct() {

    }

    @Override
    void viewCart() {

    }

    @Override
    public boolean payForShipping() {
        return false;
    }

    @Override
    public void buyItem() {

    }

    @Override
    public void returnItem() {

    }
}
