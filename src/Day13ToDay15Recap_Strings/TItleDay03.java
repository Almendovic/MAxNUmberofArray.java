package Day13ToDay15Recap_Strings;

public class TItleDay03 {
    public static void main(String[] args) {

        String name="Miss JR";
        name=name.toLowerCase();

        if(name.startsWith("mr")|| name.startsWith("Mister")){
            System.out.println("Hello Sir");
        }else if (name.startsWith("ms")|| name.startsWith("miss")|| name.startsWith("madam")){
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr")) {
            System.out.println("Hello Doctor");
        }

        if (name.endsWith("sr")) {
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith("jr")) {
            System.out.println("Nice to meet you Junior");
        }




    }
}
