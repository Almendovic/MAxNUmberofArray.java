package day39inheritance.employee;

public class Employee {




    public String name;
    public boolean isFullTime;
    public double salary;



    public void work(){
        System.out.println(name+" is working");
    }

    public Employee(String name, boolean isFullTime, double salary) {
        this.name = name;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
