package day10IFstatements;

public class NumberToDay {

    /*create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number

	Ex:
		2
		Tuesday

	Ex:
		5
		Friday
________________________________________________________________________

     */
    public static void main(String[] args) {

        int number = 9;

        if (number == 1) {
            System.out.println("Day is Monday");
        } else if (number == 2) {
            System.out.println("Day is Tuesday");
        } else if (number ==3) {
            System.out.println("Day is Wednesday");
        } else if (number ==4) {
            System.out.println("Day is Thursday");
        } else if (number ==5) {
            System.out.println("Day is Friday");
        } else if (number ==6) {
            System.out.println("Day is Saturday");
        } else if (number ==7) {
            System.out.println("Day is Sunday");
        }else{
            System.out.println(number + " is not a a valid number");
        }


    }
}

