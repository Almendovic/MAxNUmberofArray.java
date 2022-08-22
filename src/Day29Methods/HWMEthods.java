package Day29Methods;


import my_uttils.StringUtil;
import my_uttils.ArrayUtil;

import java.util.Arrays;

public class HWMEthods {

    /*create a method that will accept an int array and return the smallest number from the array


     */


    /* create a method that will accept an int array and return the biggest number from the array


     */
    /* create a method that will accept an int array and an int number. Check and return if the given number is in the array.


     */
    /*create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index

     */
    /* overload the indexOf method to work with String array and String element


     */
    public static void main(String[] args) {

        System.out.println("Min");
        int num = ArrayUtil.min(4, 2, 1, -5, 1, -1, 2, 5, 2, -1, 5);
        System.out.println(num);
        System.out.println("Max");
        System.out.println(ArrayUtil.min(5, 3, 4, 5, 2, 5, 8));
        int[]a={45,2,6,83,12};
        System.out.println(ArrayUtil.max(a));
        System.out.println("contains");
        int[]b={4,5,12,5,14};
        System.out.println(ArrayUtil.contains(b,13));
        System.out.println(ArrayUtil.contains(b,5));
        System.out.println("index of");
          int[]c={4,2,5,1,6};
        System.out.println(ArrayUtil.indexOf(c,5));
        System.out.println(ArrayUtil.indexOf(c,7));

        System.out.println("overload use: ");
        int[]d={4,5,1,6,1,6,3,5,4,1};
        System.out.println("index of first 6: "+ ArrayUtil.indexOf(d,6));
        System.out.println("index of second 6: "+ ArrayUtil.indexOf(d,6,4));

        int firstIndex =ArrayUtil.indexOf(d,6);
        int SecondIndex=ArrayUtil.indexOf(d,6,firstIndex+1);//same as line 40
        System.out.println(firstIndex);

        System.out.println("-------------------------\nAdd element method");

        String[]words ={"java","is","the","best"};

        String[] allWords=ArrayUtil.addElement(words,"language");
        System.out.println(Arrays.toString(allWords));
        System.out.println(Arrays.toString(allWords));
        System.out.println("--------------------------\nAdd element method ");


    }


}

