package day22_Array;

public class Month {

    public static void main(String[] args) {


        String name ="Chuck Norris";
       //             0123456789

        name=(name.substring(0,1) +"."+name.substring(name.indexOf(" ")+1 , name.indexOf(" ")+2) + ".");


        System.out.println(name);





    }
}
