package day43Abstraction.macgine;

public class Runner {
    public static void main(String[] args) {

        System.out.println(VendingMachine.select(1));

        try {
            System.out.println(VendingMachine.selectValid(5));
        } catch (InvalidSelectionException e) {
            System.out.println(e.getMessage());
        }


    }
}
