package day20_loops;

public class PrimeNumber {


    public static void main(String[] args) {

        int n = 1;
        boolean isPrime = true;

        if(n < 2){
            System.out.println("Not Prime");
            System.exit(0);// stops the program
        }

        for(int i = 2; i < n; i++){// starts from 2 because we dont check divisability of 0 or 1 and we want to chck until the number which is done with i<n

            if(n % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");

    }
}

/*
 if(n % i == 0){
       11 % 2
       11 % 3
       11 % 4

 */














