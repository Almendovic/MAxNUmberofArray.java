package Day25Arrays;

import java.util.Arrays;

public class MultiDimensionalArratsIntro {
    public static void main(String[] args) {
        String[] group1={"jon","Joes","james"};
        String[] group2={"Aaron","Shay","Breanna"};
        String[] group3={"Casandra","Tahir","Aygun"};


  String[][] groups=new String[3][];//index 0,1,2
   groups[0]=group1;
   groups[1]=group2;
   groups[2]=group3;


        //System.out.println(Arrays.toString(groups));// toSTring() is for single dimension Array
        System.out.println(Arrays.deepToString(groups));


        System.out.println("-------------------------------------");
        // index of el  0,1,2   0,1,2    0,1,2,3
        int[][] arr2d={{1,2,3},{4,5,6},{7,8,9,10}};
        //index of array   0      1         2

        System.out.println(Arrays.toString(arr2d[1])); //sinfle string
        System.out.println(arr2d[2][3]);// element






    }
}
/*
    String[] group1={"jon","Joes","james"};
    String[] group1={"jon","Joes","james"};
    String[] group1={"jon","Joes","james"};

 */
