package day39inheritance.employee;

public class TeamObject {
    public static void main(String[] args) {


        Tester tester=new Tester("Alen",true,150_000,true);

        System.out.println(tester);

         Developer developer=new Developer("Malika",false,170_00,true);
        System.out.println(developer);
    }
}
