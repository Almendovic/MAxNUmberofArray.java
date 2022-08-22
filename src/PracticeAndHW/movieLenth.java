package PracticeAndHW;

import java.util.Scanner;

public class movieLenth {
    /*
}The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter movie Length");
        double movieDuration = input.nextDouble();



        if (movieDuration < 0 || movieDuration == 0) {
            System.out.println("movies cannot be less than 0 minutes");

        }
        if (movieDuration > 4) {
            System.out.println("Movies cannot be more than 4 hours");
        } else {
            double ticketPrice = 0;
            if (movieDuration == 1.0) {
                ticketPrice = 8.99;
            } else if (movieDuration == 1.5) {
                ticketPrice = 10.50;
            } else if (movieDuration == 2.0) {
                ticketPrice = 12.99;
            } else if (movieDuration == 2.5) {
                ticketPrice = 14.50;
            } else if (movieDuration == 3.0 || movieDuration == 3.5 || movieDuration == 4) {
                ticketPrice = 15.99;
            }
            System.out.println("The price of the ticket: $" + ticketPrice);


        }


    }
}


