package day51Map_FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HWSaim2 {


    public static void main(String[] args) {
        Predicate<String> verifyPassword = (pass) -> {


            if (pass.length() < 8) {
                return false;
            }

            boolean isUpper = false, isDigit = false, islower = false, isSpecial = false;

            for (int i = 0; i < pass.length(); i++) {
                if (Character.isDigit(pass.charAt(i))) {
                    isDigit = true;
                }
                if (Character.isUpperCase(pass.charAt(i))) {
                    isUpper = true;
                }
                if (Character.isLowerCase(pass.charAt(i))) {
                    islower = true;
                }
                if (!Character.isAlphabetic(pass.charAt(i)) && !Character.isDigit(pass.charAt(i))) {
                    isSpecial = true;
                }
            }

            return isDigit && isUpper && islower && isSpecial;


        };
        System.out.println(verifyPassword.test("PAssword#4"));
    }
}







