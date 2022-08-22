package day06_Operators;

public class ELigibletoVote {
    public static void main(String[] args) {

        int age= 21;
        boolean isCitizen = true;
        boolean hasCriminalBackround = false;
        boolean over18 = age >= 18;

        boolean isEligible = isCitizen && over18 && !hasCriminalBackround;//  ! is flipping and beoming true from false to true 
        System.out.println("isEligible = " + isEligible);

    }
}
