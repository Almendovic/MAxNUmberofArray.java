package ReplitPractice;

import java.util.Scanner;

public class ProfitorLoss {
    public static String profit(int buyPrice,int sellPrice){
        //WRITE YOUR CODE BELOW

       if(buyPrice<sellPrice){

        return "profit";
       }else if(buyPrice>sellPrice){
           return "loss";

        }else{
          return "no loss";
       }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

}
