package Day31ArrayList;

import java.util.ArrayList;

public class RemoveingMethod {
    public static void main(String[] args) {

        ArrayList<String>words=new ArrayList<>();

        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);
        words.remove(0);
        System.out.println(words);

        System.out.println(words.remove(2));
        System.out.println(words);
        words.clear();//emptys the whole ArrayList
        System.out.println(words);
        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        System.out.println(words);

        words.remove("barn");
        System.out.println(words);

        System.out.println(words.remove("Cow"));
        System.out.println(words);

        System.out.println("---------------------------");

        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);

        nums.remove(0);
        System.out.println(nums);


        Integer a=0;
        nums.remove(a);
        System.out.println(nums);

        nums.remove((Integer) 2);
        System.out.println(nums);

        nums.add(0,4);
        System.out.println(nums);
        nums.remove((Integer)4 );
        System.out.println(nums);






    }
}
