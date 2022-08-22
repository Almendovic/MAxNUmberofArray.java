package Day13ToDay15Recap_Strings;

public class DynamicIndexofDay03 {
    public static void main(String[] args) {


        String str = "mississippi";
        //            012345678910
        // goal is to find all the indexes of "i" characters
        System.out.println("First i: "+str.indexOf("i"));
        System.out.println("Last i: " + str.lastIndexOf("i"));
        System.out.println("--------------------------------");

        System.out.println("other use of indexOf:");
        System.out.println("First i: "+ str.indexOf('i'));
        System.out.println("Second i: "+str.indexOf('i',2) );
        System.out.println("Third i " +str.indexOf('i',5));
        System.out.println("Fourth i " +str.indexOf('i',8));
        System.out.println("Hardcoded above-------------Dynamic below");
        int firstI=str.indexOf("i");
        int secondi =str.indexOf('i',firstI+1);
        int thirdi=str.indexOf('i',secondi+1);// take previous index and add 1 to it so we can srart looking for nect occurence
        int Fourth=str.indexOf('i',thirdi+1);
        System.out.println("first I " +firstI);
        System.out.println("second I " +secondi);
        System.out.println("third I " + thirdi);
        System.out.println("Fourth I " + Fourth);
        System.out.println(str.substring(4,10));



    }
}
