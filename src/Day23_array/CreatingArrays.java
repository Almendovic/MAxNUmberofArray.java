package Day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {


        String [] StudentOne={"04","Kristina","Gaidamovic","27"};
        System.out.println(Arrays.toString(StudentOne));

        //Know the number of elements,but not the values yet
        String []studentwo =new String[4];
        studentwo[0]="10";
        studentwo[1]="Olena";
        studentwo[2]="Kravestka";
        studentwo[3]= "27";
        System.out.println(Arrays.toString(studentwo));

        //know the number of elements, and add from Scanner
        Scanner input=new Scanner(System.in);
      /*  String[] studentThree=new String[4];
        System.out.println("Enter your id");
        studentThree[0]= input.next();
        System.out.println("Enter your first name");
        studentThree[1]=input.next();
        System.out.println("Enter your last name");
        studentThree[2]=input.next();
        System.out.println("Enter your batch number");
        studentThree[3]=input.next();

        System.out.println(Arrays.toString(studentThree));*/

     // most Dynamic;
        String[] studentFour =new String[4];
        String []questions={"id","first name","last name","batch number"};

        for (int i = 0; i < studentFour.length; i++) {
            System.out.println("Enter your " + questions[i]);
            studentFour[i]=input.next();


        }



    }
}
