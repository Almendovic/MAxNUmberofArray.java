package Day13ToDay15Recap_Strings;

import java.util.Scanner;

public class HWRedo_for07_07_22_Title {
    /*
create a class Title
ask the user to enter their name including titles
use the following titles to determine how to refer to the person

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name with Title");
        String title = input.nextLine();

        if (title.contains("Mr") || title.contains("Mister") || title.contains("mr")) {
            System.out.println("Hello Sir");
        }
        if (title.contains("Ms") || title.contains("Miss") || title.contains("Madam")) {
            System.out.println("Hello Ma'am");
        }
        if (title.contains("Dr") || title.contains("Doctor")) {
            System.out.println("Hello Doctor");
            if (title.contains("Sr") || title.contains("Senior")) {
                System.out.println("Nice to meet you Senior");
                if (title.contains("Jr") || title.contains("Junior")) {
                    System.out.println("Hello Ma'am");


                }
            }
        }
    }
}
