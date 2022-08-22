package Day35Constructors;

public class Employee {

    String name;
    double id;
    String jobTitle;
    double salary;


    public Employee(String name, double id, String jobTitle, double salary){ // Constractor
        this.name = name;
        this.id = id;
        this.jobTitle= jobTitle;
        this.salary = salary;

    }

    public void goToMeeting(){
        System.out.println(name + " is going to the meeting");

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


