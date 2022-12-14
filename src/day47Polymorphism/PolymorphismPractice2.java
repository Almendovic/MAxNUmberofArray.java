package day47Polymorphism;

import Day36CustomClassses.ConstrcutorCalls.Test;
import day43Abstraction.emloyee.Developer;
import day43Abstraction.emloyee.Employee;
import day43Abstraction.emloyee.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Zuhal", 27, 'F', 2, "Java ", 125000),
                new Developer("George", 27, 'F', 2, "Java Developer", 129000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 124000),
                new Tester("George", 28, 'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F', 4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M', 5, "SDET", 105000),
                new Developer("Gulistan", 26, 'F', 6, "Web Developer", 130000),
                new Tester("Yuliyg", 28, 'F', 7, "QE", 120000),
                new Developer("Cassendra", 29, 'F', 8, "Front-end Developer", 140000),
                new Tester("Aygu", 25, 'F', 9, "SDET", 130000),
                new Developer("Sophie", 26, 'F', 10, "Back end Developer", 150000),
                new Tester("Timur", 29, 'M', 11, "SDET", 115000),
                new Developer("Fady", 26, 'F', 12, "Full Stack Developer", 142000),
                new Tester("Iryna", 24, 'F', 13, "QE", 125000),
                new Developer("Enes", 26, 'M', 14, "Full Stack Developer", 142000),
                new Tester("Mikael", 30, 'M', 15, "SDET", 105000),
        };


        List<Employee> scrumMembers = new ArrayList<>();


        for (Employee employee : employees) {

            if (employee instanceof Tester || employee instanceof Developer) {
                scrumMembers.add(employee);
            }


        }
        System.out.println("--------------------------------------------------");

        List<Tester> testers = new ArrayList<>();
        List<Developer> developer = new ArrayList<>();


        for (Employee scrumMember : scrumMembers) {
            if (scrumMember instanceof Tester) {
                testers.add((Tester) scrumMember);
            }

            if (scrumMember instanceof Developer) {
                developer.add((Developer) scrumMember);
            }
        }

        System.out.println(scrumMembers);
        System.out.println("--------------------------------------------------");
        Employee testerWithMaxSalary = testers.get(0);
        Employee developerWithMaxSalary = developer.get(0);

        for (Employee scrumMember : scrumMembers) {
            if (scrumMember instanceof Tester) {
                if (scrumMember.getSalary() > testerWithMaxSalary.getSalary()) {
                    testerWithMaxSalary = scrumMember;
                }
            }

            for(Employee scrumMember1:scrumMembers){
                if(scrumMember instanceof Developer){
                    if (scrumMember.getSalary()>developerWithMaxSalary.getSalary()){
                        developerWithMaxSalary=scrumMember1;
                    }
                }
            }


        }
        System.out.println("Developer "+ developerWithMaxSalary);
        System.out.println("Tester "+ testerWithMaxSalary);
    }
}
