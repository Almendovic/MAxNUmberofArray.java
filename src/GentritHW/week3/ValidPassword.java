package GentritHW.week3;

public class ValidPassword {
    public static void main(String[] args) {


        System.out.println("PasswordValidation(\"Hello1!\") = " + PasswordValidation("Hello1!"));

    }






    public static String PasswordValidation(String str){

        int countUpper=0,countLower=0,countNumber=0,countSpecialCharacter=0;
        if(str.length()>=6&& !str.contains(" "))

            for (int i = 0; i <str.length() ; i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    countUpper++;
                }else if(Character.isLowerCase(str.charAt(i))) {
                    countLower++;
                }else if(Character.isDigit(str.charAt(i))) {
                    countNumber++;
                }else {
                    countSpecialCharacter++;



                }
            }
        if(countUpper>0&&countLower>0&&countNumber>0&&countSpecialCharacter>0) {
            System.out.println("True");
        } else{
            System.out.println("False");


        }


        return str;





    }

}


