package Day52FuctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {

    MyThirdFucntinoalInterface<String> StringReverse= (str)->{ // todo this method will reverse any string
        String  reverse=new StringBuilder(str).reverse().toString();
        return reverse;
    };


    String result=StringReverse.method("Wooden Spoon");


        System.out.println(result);









    }
}
