package day39inheritance.employee;

public class Developer extends Employee{
     boolean featureCreated;
    public Developer(String name, boolean isFullTime, double salary,boolean featureCreated) {
        super(name, isFullTime, salary);
        this.featureCreated=featureCreated;
    }

    public void develop(){
        System.out.println(name+ " Creating more features");
    }

    public String toString() {
        return "Developer{" +
                "featureCreated=" + featureCreated +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
