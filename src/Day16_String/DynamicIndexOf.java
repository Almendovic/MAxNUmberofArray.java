package Day16_String;

public class DynamicIndexOf {
    public static void main(String[] args) {

        String str = "mississippi ";//goal is to find all indexes of all the 'i' characters
              //      012345678910

        System.out.println("First i: "+ str.indexOf('i'));
        System.out.println("Last i: "+ str.lastIndexOf('i'));

        System.out.println("other use of indexof:");
        System.out.println("First i: " +str.indexOf('i'));
        System.out.println("Second i:" +str.indexOf('i', 4));
        System.out.println("Third i:" +str.indexOf("i",6));

        System.out.println("Hard coded above--------------Dynamic below");
        int firstI=str.indexOf('i');
        int secondI=str.indexOf('i',firstI+1);
        int thirdI =str.indexOf('i',secondI+1);
        System.out.println(secondI);
        System.out.println(thirdI);









    }
}
