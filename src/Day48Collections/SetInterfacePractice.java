package Day48Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("list " +list);
        System.out.println("-----------------------------");



        Set<Integer> hashSet = new HashSet<>();  // todo random  order removes duplicates
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90)); // [200, 40, 10, 90, 300] random order
        System.out.println(hashSet);
        System.out.println("-----------------------------");
        Set<Integer> linkedHashSet=new LinkedHashSet<>(); // todo ordered list as it is
        linkedHashSet.addAll(Arrays.asList(10,20,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,20,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,20,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,20,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,20,300,40,90));

        System.out.println(linkedHashSet);
        System.out.println("-----------------------------");

        Set<Integer>treeset=new TreeSet<>(); // todo does not accept null keyword organized from lowest to highest
        treeset.addAll(Arrays.asList(10,20,300,40,90));
        treeset.addAll(Arrays.asList(10,20,300,40,90));
        treeset.addAll(Arrays.asList(10,20,300,40,90));
        treeset.addAll(Arrays.asList(10,20,300,40,90));
        treeset.addAll(Arrays.asList(10,20,300,40,90));

        System.out.println(treeset);



    }
}
