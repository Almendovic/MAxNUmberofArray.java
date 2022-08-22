package day05_ArithmeticOperators;

public class Employeepractice {

    public static void main(String[] args) {

        String firstName = "James";
        String lastnames = "Bond";
        String companyName = "MI6";
        String jobTitle = "Secret Agent";
        char suite = 'E';
        int employeeId = 7;// don't want to start a number with 0
        int numberOfPTO = 15;
        double salary = 1_000_000.0;
        boolean isFullTime =true;

        String FullName= firstName + "  " +lastnames;// space is also a character
        String email = firstName + employeeId + "@" + companyName  + " .com";
        String benefits = "$" + salary + " salary a year," + numberOfPTO + "days and WFH";

        String summary = "Employee information for " + FullName + ". "  + jobTitle + "for " +companyName + ", based in suite " +suite + ".Mr/Mrs " + lastnames + " is full time: " + isFullTime + ".Contact Mr/Mrs " + lastnames + "at " +email + ".Current benefits include" + benefits;
        System.out.println(summary);







    }
}
