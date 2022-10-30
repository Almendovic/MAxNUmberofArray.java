package day51Map_FunctionalInterface;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

public class HighestFrequency2 {
    public static void main(String[] args) {

        List<String> list= new ArrayList<String>();
        list.add("java");
        list.add("java");
        list.add("python");
        list.add("C#");

        Map<String, Long> couter = list.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        System.out.println(couter);


    }
}







    /*Write a program that can find the element that has the highest frequency in an arrayList
            Note: Must use a map

                    Ex:
                    list: [java, java, python, c#]

                    output:
                    [java=2, python=1, c#=1]
                    element java has the highest frequency
*/