package Day16_String;

public class Indexofexample {
    public static void main(String[] args) {

        String s = "lollipop";
        //          01234567
        System.out.println("index of l :" +s.indexOf('l'));
        System.out.println("last index of l :"+s.lastIndexOf('l'));
        System.out.println("index of i :" +s.indexOf('i'));
        System.out.println("last index of i :"+s.lastIndexOf('i'));
        System.out.println("index of p :" +s.indexOf('p'));
        System.out.println("last index of p :"+s.lastIndexOf('p'));

        System.out.println("index of e :" +s.indexOf('e'));
        System.out.println("index of P :" +s.indexOf('P'));
        System.out.println(s.lastIndexOf('L'));
        System.out.println(s.indexOf("pop"));// gives 5 because the sequence 'pop' stars at index 5
        System.out.println("index of Pop "+s.indexOf("Pop"));// doesnt exist because P doesnt exist
        System.out.println(s.indexOf("lol"));







    }
}
