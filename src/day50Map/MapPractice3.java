package day50Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("John", 123080);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118080);
        map.put("Anderson", 125888);
        map.put("Steven", 135000);
        map.put("Alen", 135000);


        //display the names of all employees who has the maximum salaries

        int maxSalary = Integer.MIN_VALUE;

        for (Integer eachValue : map.values()) {
            if (eachValue > maxSalary) {
                maxSalary = eachValue;


            }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxSalary) {
                System.out.println(pair.getKey());

                System.out.println("maxSalary = " + maxSalary);


            }
        }
    }
}
