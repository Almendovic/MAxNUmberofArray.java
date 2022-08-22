package Day25Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {

        int[] nums={1,2,3,};
        int[] other=nums;// not creating a new array poiting to the same Array as line 6
        System.out.println("BEFORE");
        System.out.println(Arrays.toString(other));
        System.out.println(Arrays.toString(nums));

        nums[0]=10;
        other[2]=25;
        System.out.println("AFTER");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));


        int[] arr={3,4,1,5,12,5,-10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        //copyOf

        int[] a={5,10,15};
        int[] b=Arrays.copyOf(a,3);
        System.out.println("Before");// new array with size 3
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[1]=100;
        System.out.println("After");
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));

      //we onlyy changed a array
    }
}
