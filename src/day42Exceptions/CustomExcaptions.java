package day42Exceptions;
class FadyException extends RuntimeException{


    public FadyException(){
        super("Time for a short break");
    }
    class NoBreakException extends Exception{

    }


    public FadyException(String message){
        super(message);
    }
}

public class CustomExcaptions {
    public static void main(String[] args) {

        throw new FadyException("Its time for lunch break");





    }







}
