package day44Abstraction_Interface.animal;

public abstract class Animal {



    private  String name;

    private final String breed;

    private final char gender;

    private int age;

    private String size;

    private  final String color;
    public  final static  boolean canBreathe;//todo final unchangeable


    static {
        canBreathe=true;


    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if(!(gender=='M')|| gender=='F'){
            throw new RuntimeException("Invalid gender "+gender);
        }
        this.gender = gender;
        setAge(age);
       setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name.isEmpty()){
           throw new RuntimeException("Invalid name");
       }
       this.name=name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }


    public final void drink(){ // todo final so it wont be overridden
        System.out.println(name+ " is drinking ");
    }

    public abstract void eat(); // todo final and abstract never go together


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + // todo gets name only
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

