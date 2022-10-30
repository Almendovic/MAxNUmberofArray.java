package GentritHW.week3;

public class Armstrong {

    public static void main(String[] args) {
                System.out.println(isArmstrongNum(1634));
            }
            public static boolean isArmstrongNum(int num) {
                String number =String.valueOf(num);
                int multiplier=number.length();
                int sum=0;
                for(int i=0;i<multiplier;i++){
                    int digit = Integer .parseInt(""+number .charAt(i));
                    sum+=Math.pow(digit,multiplier);
                }
                return sum==num;
            }
        }



