package MentorHW;

public class FINRA {
    public static void main(String[] args) {
           String result="";
        for (int i = 1; i <=30 ; i++) {
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
