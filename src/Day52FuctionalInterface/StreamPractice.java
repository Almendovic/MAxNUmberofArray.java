package Day52FuctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));

       list= list.stream().distinct().collect(Collectors.toList());// todo remove duplicates
       // [1,2,3,4,5,6]

        System.out.println(list);


        int[] arr1={1,1,2,2,3,3,4,4,5,5,6,6};

        arr1=Arrays.stream(arr1).distinct().toArray(); // todo non-duplicated method

        System.out.println(Arrays.toString(arr1));


         List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
         list2=list2.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println(list2);



        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().skip(5).collect(Collectors.toList());
        System.out.println(list3);


        List<Integer>list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       list4= list4.stream().map(p->p*10).collect(Collectors.toList());//todo collect method

        System.out.println(list4);


        List<String > days=new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Satueday","Sunday"));

        days=days.stream().map(p->p.substring(0,3)).collect(Collectors.toList()); //todo only first 3 Characters

        System.out.println(days);


        List<Integer> list5= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens=list5.stream().filter(p->p%2==0).collect(Collectors.toList()); // todo even numbers method
        System.out.println(evens);

        List<String> names= new ArrayList<>(Arrays.asList("Java","java","jAvA","Python","Ruby")); //
        long countJava=names.stream().filter(p->p.equalsIgnoreCase("java")).count();// todo count have times method

        System.out.println("countJava = " + countJava);


        names.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));


        List<Integer> list6=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,30)); //todo AllMatch (boolean)

        boolean r1=list6.stream().allMatch(p->p%2==0);

     System.out.println(r1);

     boolean r2=list6.stream().anyMatch(p->p>20);
     System.out.println(r2);

     boolean r3=list6.stream().noneMatch(p->p%3==0);
     System.out.println(r3);






    }

}
