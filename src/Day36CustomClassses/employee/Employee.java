package Day36CustomClassses.employee;

public class Employee {


    String name;
    long id;
    String jobTitle;
    double salary;

    public Employee(String name, long id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, long id, String jobTitle) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
    }


    public void goToMeeting(){

        System.out.println(name + " Is going to a Meeting");
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
