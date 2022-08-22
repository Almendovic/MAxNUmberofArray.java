package Day31ArrayList;

import my_uttils.EasyData;

import java.util.ArrayList;

public class TestRandomData {
    public static void main(String[] args) {

        System.out.println(EasyData.getRandomNumbers(10));

        ArrayList<Integer> nums=EasyData.getRandomNumbers(10);
        System.out.println(nums);

        ArrayList<Integer>num =EasyData.getRandomNumbers(3);
        System.out.println(num);
    }
}
