package day39inheritance.employee;

public class Tester extends Employee {

         boolean bugFound;
    public Tester(String name, boolean isFullTime, double salary,boolean bugFound) {
        super(name, isFullTime, salary);
        this.bugFound=bugFound;






    }

    public String toString() {
        return "Tester{" +
                "bugFound=" + bugFound +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }

    public void test(){
        System.out.println(name +"running the regression");


    }
}
