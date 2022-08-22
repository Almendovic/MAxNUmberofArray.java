package Day37Static;
import java.util.Arrays;

import static java.lang.Math.*;
import static java.lang.Integer.*;
import static java.util.Arrays.*;

public class ImportExample {

    public static void main(String[] args) {


        System.out.println(Math.PI);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(PI);

        System.out.println(abs(-6)); //Math.abs



        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);
        parseInt(""); // Integer.parseInt();

        int [] a = {43, 4, 2};
        System.out.println(Arrays.toString(a));
        sort(a); // Arrays.sort()
        System.out.println(Arrays.toString(a)); // the reason you couldn't use just toString, is because it doesn't know which one you mean, there is multiple from different files




    }


}
