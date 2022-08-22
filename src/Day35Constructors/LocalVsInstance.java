package Day35Constructors;

public class LocalVsInstance {


    int a=5;
    int b=10;
    public LocalVsInstance(int a ,int z){ // todo a & z here are local variables
        this.a=a;
        b=z;
    }


    public void print(){

        System.out.println(a);
    }

    public static void main(String[] args) {

        LocalVsInstance obj=new LocalVsInstance(20,50);
        System.out.println(obj.a);
        System.out.println(obj.b);



    }


}
