package day49Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5));

        System.out.println(set);

        List<Integer> list =new ArrayList<>(set); // todo covert from Set to List

        System.out.println(list);

        List<String> names= null;

       // System.out.println(names.size());

        System.out.println("------------------------------------------");

        List<Character> chars = new Stack<>(); //  todo LIFO only works with Stack class
        chars.addAll(Arrays.asList('A','B','C','D'));



        ((Stack<Character>) chars).pop();

        System.out.println("chars = "+ chars);



        List<String > name  = new LinkedList<>();  // todo FIFO only works with DEQUE ,ARRAYDEQUE, LINKEDLIST
        name.addAll(Arrays.asList("James","Jimmy","Kathy","Breanna","Max"));

        ((LinkedList<String>) name).poll();

        System.out.println(name);
    }
}
