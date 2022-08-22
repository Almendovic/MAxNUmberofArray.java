package Day31ArrayList;

import java.util.ArrayList;

public class loops {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);


        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }

        System.out.println();

        for (Integer each : nums) {
            System.out.print(each + " ");
        }

        System.out.println();

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor Odinson");
        avengers.add("Captain America");
        avengers.add("Hawkeye");
        //  print each initial. if there is onlyone word,
        for (String each : avengers) {
            if (each.contains(" ")) {
                int space=each.indexOf(" ")+1;
                System.out.println(each.substring(0, 1) + each.substring(space,space+1));// could have just use charAt()
            } else {
                System.out.println(each.charAt(0));
            }

        }
    }
}
