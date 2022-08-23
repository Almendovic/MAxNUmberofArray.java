package day39inheritance.app;

public class App {



    /*reate an App class

    - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version

Create a class Instagram

    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram

Create a class Youtube

    - Youtube class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        watchVideo()
            Example output: prints Watching java tutorial

     */

    public String appName;
    public double version;


    public App(String appName, double version) {
        this.appName = appName;
        this.version = version;
    }


    public void download(){
        System.out.println(appName+" is downloading version: "+version);
    }

    public String toString() {
        return "App{" +
                "appName='" + appName + '\'' +
                ", version=" + version +
                '}';
    }
}
