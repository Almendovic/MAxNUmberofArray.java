package Day35Constructors.school;

public class School {
    String name;
    int totalNumOfStudents;
    double avgGpa;

    public School(String name,int totalNumOfStudents,double avgGpa){
        this.name=name;
        this.totalNumOfStudents=totalNumOfStudents;
        this.avgGpa=avgGpa;

    }

    /*public School(String inputName,int inoutStudents,double inoutGpa){

        name=inputName;
        totalNumOfStudents=inoutStudents;
        avgGpa=inoutGpa;


    }*/


    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNumOfStudents=" + totalNumOfStudents +
                ", avgGpa=" + avgGpa +
                '}';
    }
}
