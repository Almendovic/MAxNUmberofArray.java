package ReplitPractice;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {

        System.out.println("Enter keyword");
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        boolean c=email.contains("project");
        boolean name=email.contains("Alejandro");

        if(email.contains("Alejandro") && email.contains("project")){
            System.out.println("priority");
        } if(c){
            System.out.println("priority");
        }else if(!name){
            System.out.println("don't read");
        }



    }
}
