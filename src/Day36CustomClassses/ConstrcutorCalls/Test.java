package Day36CustomClassses.ConstrcutorCalls;

public class Test {

     public Test(){
          System.out.println("A");
     }


     public Test(int a){ // todo A and B
          this();
          System.out.println("B");
     }

        public Test(double a){ // todo A B C
          this(10);
             System.out.println("C");
        }


        public Test(String str){ //todo A B C D
              this(2.5);
             System.out.println("D");
        }

    public static void main(String[] args) {


         new Test(2.6);


    }


}
