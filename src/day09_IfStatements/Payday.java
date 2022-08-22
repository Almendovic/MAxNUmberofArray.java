package day09_IfStatements;

public class Payday {
    public static void main(String[] args) {

        double hourlyRate= 60;
        int hoursPerWeek =50;
        double netPay;


        if(hoursPerWeek >40){

            int overtimeHours = hoursPerWeek-40;
            netPay=hourlyRate *40;//calculate normal pay for 40 hour week
            netPay +=hourlyRate * overtimeHours *1.5;// total earned from overtime

            //overtime calculation
        }else{
            netPay = hourlyRate * hoursPerWeek;
          //worked under or equal 40  hours,so no overtime
        }
        System.out.println("Net pay: " + netPay);


    }
}
