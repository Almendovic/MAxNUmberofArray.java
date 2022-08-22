package Day24Array;

public class Initials {
    public static void main(String[] args) {


        String[] names={"Cydeo school","Wooden Spoon","Manual Testing"};

        for (String name:names) {
            String intial=name.charAt(0)+"."+name.charAt(name.indexOf(" ")+1);
            System.out.println(intial);
         }





    }
}
