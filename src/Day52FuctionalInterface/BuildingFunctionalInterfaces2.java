package Day52FuctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildingFunctionalInterfaces2 {
    public static void main(String[] args) {

        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if (each == b) {
                    result = true;
                    break;
                }

            }
            return result;
        }; // todo return type boolean with 2 objects
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean r1 = contains.test(arr, 11);

        System.out.println(r1);


        System.out.println("------------------------------------------");

        // create a function that can check if two strings are anagram

        BiPredicate<String, String> anagram = (a, b) -> {

            String[] arr1 = a.split(""); //[b,a,c]
            String[] arr2 = a.split("");//[c,a,b]
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);


        };

        System.out.println("------------------------------------------");
        // create a function that print a given string for multiple times
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Java", 5);
        // create a function that takes first and last names and returns a formatted version

        //"jAVA","Programming"========> Java programming

        System.out.println("------------------------------------------");

        Map<String ,String> scrumteam1=new LinkedHashMap<>();
        scrumteam1.put("Abdula","SM");
        scrumteam1.put("Nikita","Developer");
        scrumteam1.put("Alina","Developer");
        scrumteam1.put("Mert","PO");
        scrumteam1.put("Lee","SDET");

        scrumteam1.forEach((k,v)-> System.out.println(k+":"+v));


        System.out.println("-----------------------------------------");

        BiFunction<List<String>, List<Integer>,Map<String ,Integer>> merge2=(j,k)->{
            Map<String,Integer> map=new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i),  k.get(i));



            }
            return map;
        };

           List<String> names=new ArrayList<>(Arrays.asList("Layan","Ksenya","Aygun"));

           List<Integer> scores=new ArrayList<>(Arrays.asList(90,85,95));
           Map<String,Integer> students=merge2.apply(names,scores);
        System.out.println(students);
    }
}
