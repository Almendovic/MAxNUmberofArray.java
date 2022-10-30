package GentritHW.week3;

public class DuplicateCharacters {
    public static void main(String[] args) {

        System.out.println("removeDuplicates(\"AAABBBCDD\") = " + removeDuplicates("AAABBBCDD"));


    }


    public static String removeDuplicates(String str){
         String unique="";


        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)== str.charAt(j)){
                    count++;
                }
                if(count>1 &&!unique.contains("" + str.charAt(i))){
                    unique+=str.charAt(i);
                }
            }

        }

        return unique;


    }




}
/*
3.String -- Remove Duplicates
        Write a return method that can remove the duplicated values from String

        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
