package day11Nested;

public class FIedlTrip {
    public static void main(String[] args) {

        int grade = 3;
        String location = "";
        String teacher = "";
        int numberOfGroups = 0;

        if (grade > 0 && grade <= 6) {
            //valid grades
            if (grade == 1) {
                location = "Apple Orcahrd";
                teacher = "Ms Smith";
                numberOfGroups = 5;

            } else if (grade == 2) {
                location = "Zoo";
                teacher = "Mr Bond";
                numberOfGroups = 6;
            } else if (grade == 3) {
                location = "Aquarium";
                teacher = "Mr Reyes";
                numberOfGroups = 2;
            } else if (grade == 4) {
                location = "Museum";
                teacher = "Mr Wilson";
                numberOfGroups = 5;
            } else if (grade == 5) {
                location = "Movie Theater";
                teacher = "Mr leo";
                numberOfGroups = 3;
            } else if (grade == 6) {
                location = "Six Flags";
                teacher = "Mr Watson";
                numberOfGroups = 8;


            } else {
                System.out.println("Invalid grade");
            }
            System.out.println("Grade " + grade);
            System.out.println("Location " + location);
            System.out.println("Teacher: " + teacher);
            System.out.println("Number of groups" + numberOfGroups);




        }
    }
}
