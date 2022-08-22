package Day29Methods;

public class FrequencyOfCharacter {
    /*
      given a String and vhar determine how many times the given char is found in the String
    "java"
    a
    >2
     */
    public static int frequencyOfChar(String str,char letter){

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==letter){
                count++;
            }
        }
            return count;



    }

    public static void main(String[] args) {

        System.out.println(frequencyOfChar("java",'a'));
        System.out.println(frequencyOfChar("apple",'a'));




    }
}
