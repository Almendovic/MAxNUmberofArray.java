package Day23_array;

public class LoopsArray {
    public static void main(String[] args) {


        int[] nums = {4, 213, 6};


        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("For each loop");

        for (int eachNumber : nums) {
            System.out.println(eachNumber);


        }

    }
}


