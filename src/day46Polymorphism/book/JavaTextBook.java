package day46Polymorphism.book;

public class JavaTextBook extends Ebook{


    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading book");
    }

    @Override
    public void download() {
        System.out.println("Downloading book");
    }

    @Override
    public void open() {
        System.out.println("Open book");
    }
}
