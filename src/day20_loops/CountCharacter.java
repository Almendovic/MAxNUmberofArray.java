package day20_loops;

public class CountCharacter {
    public static void main(String[] args) {

/*
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
	Ex:
		Input:

		Output:
			3 uppercase letters
			6 lowercase letters
			5 numbers

 */

        String s="2juMp41EEkd4s4 ";
        int upper=0,lower=0,number=0;

        for (int i = 0; i < s.length(); i++) {
            char eachLetter=s.charAt(i);

            if(eachLetter>='A'&& eachLetter<='Z'){
                upper++;
            }else if(eachLetter>='a' && eachLetter<='z'){
                lower++;
            }else if(eachLetter>='0'&& eachLetter<='9'){
                number++;
            }
        }
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("number = " + number);





    }
}
