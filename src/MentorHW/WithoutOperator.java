package MentorHW;

public class WithoutOperator {
    public static void main(String[] args) {

        double num1 =15;
        int num2=2;
        int count=0;

        for( double i=num1;i>=1;i-=num2){
            count++;
        }

        System.out.println(count);


        double result=num1/num2;
        System.out.println("result = " + result);


    }
}
