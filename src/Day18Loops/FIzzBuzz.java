package Day18Loops;

public class FIzzBuzz {
    public static void main(String[] args) {

           int limit=50;
           int count=0;



           while (count<=1){
               if(count %3==0 && count%5==0) {
                   System.out.println(count + "Fizzbuzz");

               }else if(count %3==0 ){

                   System.out.println("Fizz");
               }
              else if(count %5==0){
                   System.out.println("Buzz");

               }
              count++;


               }



           }





    }

