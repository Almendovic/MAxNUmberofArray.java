package Day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class partyList {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many people are coming to the party?");
        int size= input.nextInt();

       String[] names=new String[size]; // new String[input.nextInt()]
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name of person "+ (i +1));
            String guests=input.next();
            names[i]=guests;// names[i]= input.next()
        }
        System.out.println("Final list coming to the party");
        System.out.println(Arrays.toString(names));





    }
}
