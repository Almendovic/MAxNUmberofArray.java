package Day35Constructors;

public class EmployeeResult {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Shirin", 30, "Manager", 1500000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Nurzat", 25, " Assistant Manager", 1300000);
        System.out.println(employee2);

        Employee employee3 = new Employee("Jasmine", 28, "CEO", 2000000);
        System.out.println(employee3);

        employee1.goToMeeting();
        employee2.goToMeeting();
        employee3.goToMeeting();


    }
}