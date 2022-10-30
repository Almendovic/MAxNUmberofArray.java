package SoftSkilll;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class PythonJava {
    public static void main(String[] args) {
        String list = "java, java, python, c#";
        String[] arr = list.split(", ");
        Map<String, Integer> result  = new LinkedHashMap<>();

        for (String each : arr) {
            result.put(each, Collections.frequency(Arrays.asList(arr),each));
        }
        System.out.println("result = " + result);


    }
}
