package day39inheritance.app;

public class Instagram extends App{

    /*Create a class Instagram

    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram


     */






    public Instagram(String appName, double version) {
        super(appName, version);




    }

   public void postPicture(){
       System.out.println("Posting picture to+  "+appName);
   }

   /* public String toString() {
        return "Instagram{" +
                "appName='" + appName + '\'' +
                ", version=" + version +
                '}';
    }*/
}
