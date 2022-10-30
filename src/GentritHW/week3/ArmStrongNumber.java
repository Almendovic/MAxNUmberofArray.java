package GentritHW.week3;

public interface ArmStrongNumber {
 static boolean isArmStrongNumber(){



     int number= 371,originalNumber,remainder, result=0;
     originalNumber=number;
      while(originalNumber !=0){

          remainder=number%10; //153%10
          result+= Math.pow(remainder,3);
          number=number/10;
      }
      if(originalNumber==result){
          return  true;
      }

      return false;





    }






}
