package day11Nested;

public class ArmyQualifications {
    public static void main(String[] args) {

        int age = 20;
        boolean hasDiploma = false;
        boolean isCitizen = false;

        if ((age >= 18 && age <= 35) && hasDiploma && isCitizen) {
            System.out.println("You Qualify for the army");
        } else{
              //multi-branch is to give information about the age
            if (age < 0 || age > 120) {
                System.out.println("Not a valid age number ");
            } else if (age < 18) {
                System.out.println("You are too young , need to be at least 18");
            } else  if (age>35){
                System.out.println("You are too old, limit is 35 years old");


            }


            //separate
            if(!hasDiploma){
                System.out.println("You need at least a high school diploma");
            }

            //separate

            if(!isCitizen){
                System.out.println("You need to be a citizen to apply");
            }


        }
    }
}

