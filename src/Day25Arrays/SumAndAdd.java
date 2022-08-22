package Day25Arrays;

import java.util.Arrays;

public class SumAndAdd {
    public static void main(String[] args) {


        /*
         given an array all the elemnts and add the sum value to the end of the array


         int[] n =[5,1,2};


         */


        int[] arr ={5,1,2};
        int sum=0;

        for(int each : arr){
            sum+=each; // goes through every element and adds to the sum variable
        }
        // sum=sum

        int[] newArray= Arrays.copyOf(arr,arr.length+1);// added extra element

        System.out.println(Arrays.toString(newArray));

        newArray[newArray.length-1]=sum;// storing the sum value into the last index of the newArray

        System.out.println(Arrays.toString(newArray));

    }
}
