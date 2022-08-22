public class PrimitiveDataTypes {

      public static void main (String [] args) {

          //Integer: age,year, salary,miles
          byte age =65;//variable name needs to ,meaningfull and readible,cannot start with diggits
          short year = 2000;//only _ or $ can be added in variable
          int salary=100000; //in java int is preffered
          long miles =9999999999l;

          // Decimals: tax, pi
          double tax=0.26; // double is prefered deccimal type for decimal
          float  pi= 3.14f;

          // symbols: @,#
          char ch1='@';
          char ch2= '#';

          System.out.println(age);// 65
          System.out.println(year);
          System.out.println(salary);
          System.out.println(miles);
          System.out.println(tax);
          System.out.println(pi);
          System.out.println(ch1);
          System.out.println(ch2);

          System.out.println("--------------------------------------------------");

          boolean result1 = true;
          boolean result2 = false;
          boolean result3 = 9 < 10;

          System.out.println(result3);

          System.out.println("---------------------------------------------------");

          int a = 300;
          int b = 200;
          boolean AisGreaterThanB = a > b;

          System.out.println(AisGreaterThanB);





      }




}
