package GentritHW.week3;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("1jhj2jh4hjh3"));
    }

    public static String sumOfDigits(String digits) {
        int sum = 0;
        int sum22 = 0;
        for (char each : digits.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        return Integer.toString(sum);

    }
}
