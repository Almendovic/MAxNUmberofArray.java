package day43Abstraction.Shape;

public abstract class shape {


    private String name;


    public shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  abstract void area();

    public abstract void perimeter();



    @Override
    public String toString() {
        return "shape{" +
                "name='" + name + '\'' +
                '}';
    }
}

