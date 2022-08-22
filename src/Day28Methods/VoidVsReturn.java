package Day28Methods;

public class VoidVsReturn {


    public static void main(String[] args) {
        sayHello();
        sayBye();// the return value was not used, so we dont see any diefference
        // chaAt(0)
        System.out.println(sayBye());// methods return String
        String str=sayBye();//method returnsString and assigned the result into new variable
    }

    public static void sayHello(){
        System.out.println("Hello");
    }
    public static String sayBye(){
        return "Bye";
    }





}
