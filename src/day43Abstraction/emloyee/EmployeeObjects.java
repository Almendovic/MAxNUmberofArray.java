package day43Abstraction.emloyee;

public class EmployeeObjects {
    public static void main(String[] args) {



/*        Person person=new Person("Josh",35,'M');

            Employee employee = new Employee("Ali",30,'M',42,"SDET",1450000)
          */


        Tester tester = new Tester("Ali", 30, 'M', 42, "Sdet", 1400000);
        Developer developer = new Developer("Alex", 28, 'M', 45, "Developer", 150000);
        Teacher teacher = new Teacher("Anna", 56, 'F', 67, "Teahcer", 20000);
        Driver driver = new Driver("JOhn", 78, 'M', 87, "Driver", 50000);

        System.out.println(tester);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();


        System.out.println("---------------------------");

        developer.work();
        developer.sleep();
        developer.eat();
        developer.unitTest();

        System.out.println("-------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();


















    }
}
