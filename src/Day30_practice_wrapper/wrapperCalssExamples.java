package Day30_practice_wrapper;

public class wrapperCalssExamples {
    public static void main(String[] args) {

        byte b=9;
        Byte b2=23;

       Character c='j';
        System.out.println(c);

        int i=4;
        Integer i2=i;//autoboxing
        System.out.println(i2);

        Integer i3=32;// unboxing
        int i4=i3;
        System.out.println(i4);

        Integer i5=new Integer(10);// outdated
        System.out.println(i5);

        Integer i6=10;
    }
}
