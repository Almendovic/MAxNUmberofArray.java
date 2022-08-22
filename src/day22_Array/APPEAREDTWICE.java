package day22_Array;

public class APPEAREDTWICE {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int j = 0; j < chars.length; j++) {

            char ch = chars[j];//'A'
            int freqyency = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    freqyency++;
                }
            }
     if (freqyency==2){
         System.out.print(ch);
     }


        }
    }
}
