package Day31ArrayList;

import java.util.ArrayList;

public class CreatingArrayLits {
    public static void main(String[] args) {


        ArrayList<String>list1= new ArrayList<>();
        list1.add("Friday");
        list1.add("java");
        list1.add("movies");
        list1.add("sports");
        System.out.println(list1);

        ArrayList<String>list2=list1;
        list2.add("soft skills");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("-------------------------");

        ArrayList<String>list3= new ArrayList<>(list1);// collection type
        list3.add("C#");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
