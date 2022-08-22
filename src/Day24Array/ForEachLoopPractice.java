package Day24Array;

public class ForEachLoopPractice {
    public static void main(String[] args) {


        String[] words ={"Java programming","Cydeo School","Wooden Spoon","Early Birds","Angry Birds"}; //First and Last Character


             for( String each:words ){

                 System.out.println(" "+each.charAt(0)+each.charAt(each.length()-1));
             }






    }
}
