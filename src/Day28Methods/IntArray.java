package Day28Methods;

public class IntArray {

    public static void main(String[] args) {
        int[]arr= {2, 3, 4, 5, 6, 7};
        int sum= sum(arr);
        System.out.println(sum);
    }
    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum

     */
    public static int sum(int[]arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}


