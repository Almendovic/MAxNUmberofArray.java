package day39inheritance.people;

public class Employee extends Person{

/*

    public Employee(){
        super();todo calls parent constructor with no args
    }
*/
    double salary;

    public Employee(String name,int age,double salary){
        super(name,age);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
