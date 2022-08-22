package day22_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that is capable enough to contain 5 names

       String[] myGroup=new String[5]; // 0~4] reserved by Array//TODO: "null" is default value fro non-primitive,and 0 for primitive.Float, double== 0.0,boolean==false.
       myGroup[0]="Gunay";
       myGroup[1]="Neira";
       myGroup[2]="Suat";
       myGroup[3]="Hulya";
       myGroup[4]="Mikael";
       //myGroup[5]
        //myGroup[-1]

        //System.out.println(myGroup);//hashcode
        System.out.println(Arrays.toString(myGroup));// every array has index #


        System.out.println("------------------------------------------------");

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};


        System.out.println(Arrays.toString(days));

        int number =7;

        if(number<1|| number>7){
            System.err.println("Invalid Number");
            System.exit(0);

        }

        System.out.println(days[number-1]);
        System.out.println(Arrays.toString(days));





    }
}
