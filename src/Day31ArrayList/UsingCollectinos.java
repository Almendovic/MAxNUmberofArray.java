package Day31ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectinos {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(126, 578, 270, 323, 23, 809, 817, 610, 435, 398));

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println("Before: " + list);
        Collections.sort(list);
        System.out.println("After:" + list);

        System.out.println("2nd min: " + list.get(1));
        System.out.println("2nd max: " + list.get(list.size() - 2));

        Collections.shuffle(list);
        System.out.println(list);

    }
}
