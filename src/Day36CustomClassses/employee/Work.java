package Day36CustomClassses.employee;

import ReplitPractice.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Work {
    public static void main(String[] args) {

        Employee james=new Employee("James",7,"Spy",10_000_000);
        james.goToMeeting();
        System.out.println(james);

        Employee obj=new Employee("Ana",5,"Sdet");
        System.out.println(obj);

        Employee alen =new Employee("Alen");
        System.out.println(alen);

        Employee John=new Employee("John",8,"Sdet",100000);
        System.out.println(John);

        System.out.println("------------------------------------");



        EmployeeV2 james2=new EmployeeV2("James",7,"Spy",10_000_000);

        System.out.println(james2);

        EmployeeV2 obj10=new EmployeeV2("Ana",5,"Sdet");
        System.out.println(obj10);

        EmployeeV2 alen2 =new EmployeeV2("Alen");
        System.out.println(alen2);

        EmployeeV2 John2=new EmployeeV2("John",8,"Sdet",100000);
        System.out.println(John2);

        Employee[] arr =new Employee[3];
        arr[0]=james;
        arr[1]=obj;
        arr[2]=John;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].name);
        System.out.println(arr[0].salary);

        ArrayList<Employee> list =new ArrayList<>();

    }
}
