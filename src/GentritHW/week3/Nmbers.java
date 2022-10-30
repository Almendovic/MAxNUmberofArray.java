package GentritHW.week3;

public class Nmbers {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                result += i + "";
            } else {
                if (i % 2 == 0) {
                    result += "Codility";
                }
                if (i % 3 == 0) {
                    result += "Test";
                }
                if (i % 5 == 0) {
                    result += "Coders";
                }
            }
            result += "\n";
        }
        System.out.println(result);
    }
}