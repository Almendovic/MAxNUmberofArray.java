package Day28Methods;

public class Palindrome {
    /* create a method that will that will accept a String and find if it is Palindrome or not (boolean)

    */
    public static void main(String[] args) {

       boolean reverse= Palindrome("Racecar");
        System.out.println(reverse);



    }




      public static boolean Palindrome(String word){
          String reverse="";
         for (int i=word.length()-1;i>=0;i--){
             reverse+=word.charAt(i);
         } if(word.equalsIgnoreCase(reverse)){
            //  System.out.println("Palindrome: "+reverse);
              return true;
          }else {
             return false;
              //System.out.println("Not Palindrome");
          }


      }










}

