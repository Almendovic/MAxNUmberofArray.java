package Day38GarbageCollectionAccessModifiers.reactangle;

public class UseRectangle {

    public static void main(String[] args) {


        Rectangle rectangle1=new Rectangle();

        rectangle1.setLength(10);
        rectangle1.setWidth(5);
        // direct access to the variable is not possible because they have private modifier
        //use setter methods to assign
       /* System.out.println(rectangle1.length());
        System.out.println(rectangle1.width());
        */

        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());


    }

}
