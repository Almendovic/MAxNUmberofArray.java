package Day28Methods;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        checkNum(0);
        checkNum(51);
        checkNum(-14);
        Scanner input=new Scanner(System.in);
        checkNum(input.nextInt());

        int num =3;
        checkNum(num);
    }

    public static void checkNum(int num){

        if(num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }


    }



}
