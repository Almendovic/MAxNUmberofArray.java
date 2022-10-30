package day51Map_FunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class HWSaim1 {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        String Min = "";

        int min = Integer.MAX_VALUE;
        String Max = "";


        Map<String, Integer> employees = new LinkedHashMap<>();
        //            key        value
        employees.put("Alen", 125000);
        employees.put("Gani", 150000);
        employees.put("Malika", 160000);
        employees.put("Kylysh", 200000);
        employees.put("Jay", 140000);
        employees.put("Shirin", 120000);
        System.out.println(employees);

        for (Map.Entry<String, Integer> eachEmployee : employees.entrySet()) {
            if (eachEmployee.getValue() > max) {
                max = eachEmployee.getValue();
                Max = eachEmployee.getKey();
            }
            if (eachEmployee.getValue() < min) {
                min = eachEmployee.getValue();
                Min = eachEmployee.getKey();
            }

            if (eachEmployee.getValue() >= 120000 && eachEmployee.getValue() <= 150000) {
               // System.out.println(eachEmployee.getValue() + " : " + eachEmployee.getKey());
            }

            if (eachEmployee.getValue() <= 180000) {
              //  System.out.println(eachEmployee.getValue() + " : " + eachEmployee.getKey());


            }

                eachEmployee.setValue(eachEmployee.getValue() + 10000);
               // System.out.println(eachEmployee.getValue() + " : " + eachEmployee.getKey());






        }
        System.out.println("---------------------------------------------");
        System.out.println("name = " + Max);
        System.out.println("max = " + max);
        System.out.println("name = " + Min);
        System.out.println("min = " + min);
        System.out.println("After Bonus "+ employees);
        System.out.println("--------------------------------");
    }
}

//Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

// Use the created map to find the following:

//    1.1 who has the maximum salary?
//    1.2 who has the minimum salary?
//    1.3 how many employees has the salary between 120k ~ 150K?
//    1.4 display the names of the employees who are making less than 118k?
//   1.5 increase the salary of each employee by 10K


/*
for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if(entry.getValue()<120000){
        entry.setValue(entry.getValue()+10000);
        }
        }
        System.out.println("map = " + map);*/
