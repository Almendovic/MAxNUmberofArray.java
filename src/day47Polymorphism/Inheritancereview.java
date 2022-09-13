package day47Polymorphism;

public class Inheritancereview {

    int a;

    public Inheritancereview( int a){
        System.out.println("Parent class constructor");
    }
    void method1(){

    }
}



class A extends Inheritancereview{
    public A(int a) {
        super(a);
    }
}

class B extends Inheritancereview{
    public B(int a) {
        super(a);
    }
}

class C extends Inheritancereview{
    public C(int a) {
        super(a);
    }
}
class D{
    void m(){
        super.toString();
    }


}
