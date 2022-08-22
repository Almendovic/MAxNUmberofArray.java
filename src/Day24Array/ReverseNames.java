package Day24Array;

public class ReverseNames {
    public static void main(String[] args) {

        String[] names={"Cydeo school","Wooden Spoon","Manual Testing"};


        for (String name : names) {

            String reverse="";


            for (int i = name.length()-1; i >=0 ; i--) {
                reverse+=name.charAt(i);



            }
            System.out.println(reverse);



        }






    }
}
