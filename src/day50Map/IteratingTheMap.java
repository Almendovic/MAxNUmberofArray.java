package day50Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {


        Map<String ,Integer> students = new HashMap<>();
        students.put("Antony",20);
        students.put("Maria",21);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andiy",98);

        Set<String > keys =students.keySet();

        Map<String,Integer> earlyBirds =new HashMap<>();// score>=90
        Map<String ,Integer> angryBirds=new HashMap<>(); // score<90

        for(String key:students.keySet()){
            Integer value=students.get(key);
            if(value>=90){
                earlyBirds.put(key,value);
            }else {
                angryBirds.put(key,value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        Set<String > names= students.keySet();

        System.out.println("----------------------------------------------------------");

        Collection<Integer> scores =students.values();
        System.out.println(scores);

        List<Integer> score = new ArrayList<>(students.values());

        System.out.println(score);

        for(Integer value: students.values()){
            System.out.println(value);
        }


        System.out.println("---------------------------------------------------------");
        int maxScore=Integer.MIN_VALUE;
        int minscore=Integer.MAX_VALUE;

        for(Integer score1: students.values()){
            if(score1>maxScore){
                maxScore=score1;
            }

            if(score1<minscore){
                minscore=score1;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minscore = " + minscore);


        System.out.println("-------------------------------------------------------");

        int max= Collections.max(students.values());
        int min =Collections.min(students.values());

        System.out.println("---------------------------------------------");

        // how many students has the score of 95 or greater

         int count = 0;

         for(Integer eachScore: students.values()){
             if(eachScore>= 95){
                 count++;
             }
        }
        System.out.println(count);


        System.out.println("--------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());

        }









        for(String  eachkey: students.keySet()){
            Integer eachValue=students.get(eachkey);
            if( eachValue<90){
                System.out.println(eachkey);
            }

        }






    }
}
