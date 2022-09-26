package day50Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //   key       value
        Map<Integer,String> hashMap =new HashMap<>();//todo can have multiple null values, but only one null key
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");
        hashMap.put(null,"Cihad");
        hashMap.put(null,"Emre");

        System.out.println("hashMap = " + hashMap);

        System.out.println(hashMap.get(40)); // todo provide key not index #

        System.out.println("-----------------------------------");

        Map<Integer,String> linkedHashMap =new LinkedHashMap<>();

        linkedHashMap.put(10,"Arthur"); // todo order is the same
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(null,"Cihad");
        linkedHashMap.put(null,"Emre");

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("---------------------------------");

        Map<Integer,String> treeMap =new TreeMap<>();// todo key can not be null, value can be null and duplicated

        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Isabella");


        System.out.println("treeMap = " + treeMap);

        System.out.println("---------------------------------");


        Map<Integer,String> hashtable =new Hashtable<>();// todo both key and value cannot be null
        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Isabella");

        System.out.println("hashtable = " + hashtable);


    }
}
