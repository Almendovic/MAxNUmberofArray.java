package day10IFstatements;

public class IFWithNoBrackets {
    public static void main(String[] args) {

        if(3 < 9){
            System.out.println("First");
            System.out.println("Second");
        }

        if(3> 9)
        System.out.println("Third");//this is the line that gets executed if the statement is true
        System.out.println("Fourth");// This is not a pert of if statement
        System.out.println("__-___________________________");

        if(5%2==0)
            System.out.println("even");
        else
        System.out.println("odd");


    }
}
