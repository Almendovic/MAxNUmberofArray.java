package CanvasPractice;

public class FrequncyOfCharacter {
    public static void main(String[] args) {


        String str="AAABBBC";
        char ch='A';

        int frequency=0;//+1+1+1==>

        for (int i = 0; i <=str.length()-1; i++) {// i: indexes of str
            char eachChar=str.charAt(i);// eachChar: each character of str
            //'A'== 'A'
            if (ch==eachChar) {// if given char is matching with eachChar,Teh ch is appereared in the string
                frequency++;
            }
        }
        System.out.println("Frequency: "+ frequency);



    }
}
