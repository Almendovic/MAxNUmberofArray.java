public class Number {
    public static void main(String[] args) {

           String result="";
           int number=30;

        for (int i = 0; i <=number; i++) {
            if(i%3!=0 && i%5!=0){
                result+=i;
            } else {
                if(i%3==0){
                    result+="FIN";
                }if (i%5==0){
                    result+="RA";
                }
            }
            result+=" ";
        }
        System.out.println(result);


        }
    }

