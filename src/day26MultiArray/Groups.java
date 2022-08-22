package day26MultiArray;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String[][] cydeo={

                {"Alen","Tina","Alena","Nargiza"},
                {"Anam","Baz","Bursa","Ostap"},
                {"Rabia","Shahad"},
                {"Ketino","Eylul","Nadia"}




        };
        System.out.println(Arrays.deepToString(cydeo));// prints the whole 2d array
        System.out.println(cydeo.length); // how ,many inner, 1d array is there-> how many elements in the 2d array
        System.out.println(cydeo[2].length);//how many elements in the array ay index 2
        System.out.println(cydeo[0][3]);//accessing exact element from the inner array
        System.out.println(Arrays.toString(cydeo[1]));

        System.out.println("-----------------------------");


        for(String[] eachInner:cydeo){// to loop through a 2d array, the elements type is a 1d array
            System.out.println(Arrays.toString(eachInner));
        }


        System.out.println();//how to loop through each name
          //how to loop through each name and print the last letter in uppercase
        for(String[] eachInner:cydeo){
            for (String eachName:eachInner){
                System.out.print(eachName.substring(eachName.length()-1).toUpperCase()+ " ");// to print last letter to upper case
            }
        }




    }
}
