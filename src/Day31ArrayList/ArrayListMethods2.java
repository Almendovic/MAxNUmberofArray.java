package Day31ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);


        System.out.println(list);
    /*      int num=1;
        list.remove(1);*/

        Integer  num=200;
        boolean r= list.remove(num);
        System.out.println(list);
        System.out.println(r);

        System.out.println("-------------------------------");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("-------------------------------");

        ArrayList<Character>character=new ArrayList<>();
        character.add('A');
        character.add('A');
        character.add('A');
        character.add('A');
        character.add('A');

        int a=character.indexOf('A'); //0
        int b=character.lastIndexOf('A');//4

        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------------------------");

        boolean r2 =character.contains('A');

        boolean r3=character.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("--------------------------------------");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));// == compares address

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(300);
        nums.add(800);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);

        // nums.remove(300);  the 300 is an int here, so it is trying to remove index 300
        nums.remove((Integer) 300); // 300 is being cast to Integer, so it will remove the element
        System.out.println(nums);
        nums.remove(nums.lastIndexOf(300));
        System.out.println(nums);











    }
}
