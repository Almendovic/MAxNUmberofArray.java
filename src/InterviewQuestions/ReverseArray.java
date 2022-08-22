package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        String [] num={"one |","two |","three |" ,"four |","five |"};

        System.out.println( num[4]+num[3]+num[2]+num[1]+num[0]);
        System.out.println("-------------------------------");



        int[] r={1,2,3,4,5};

         r[0]=5;
         r[1]=4;
         r[2]=3;
         r[3]=2;
         r[4]=1;
        System.out.println(Arrays.toString(r));


    }
}
