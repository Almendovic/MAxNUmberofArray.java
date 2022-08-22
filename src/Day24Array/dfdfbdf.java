package Day24Array;

public class dfdfbdf {


    public static void main(String[] args) {


        String[] names={"Cydeo school","Wooden Spoon","Manual Testing"};


     for(String each:names){

       String reverse="";


         for (int i = each.length()-1; i >=0 ; i--) {
             reverse+=each.charAt(i);

         }
         System.out.println(reverse);


        }



    }

}
