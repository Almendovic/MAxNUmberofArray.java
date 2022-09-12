package day44Abstraction_Interface.library;

public class Library {

    public void getLibraryCard(String city) {
        if (city.equalsIgnoreCase("Fairfax") || city.equalsIgnoreCase("Mclean")) {
            System.out.println("Library Card");
        } else {
            throw new NonResidentException("Non-Residents not allowed");
        }
    }
    public void borrow (boolean checkOut) throws FailToCheckOutException{
        if(checkOut){
            System.out.println("Enjoy reading");
        }else{
            throw new FailToCheckOutException("Fail to check out");
        }
    }
}



    /*
    Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call

    create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file
     */
