package Day35Constructors;

import java.util.ArrayList;

public class Song {

/*
    create a class called Song

        - data:

    name, length, artist, genre //todo Instant variables

        - constructor

            - create a constructor that creates an Song object with the name, length, artist, and genre

        - method:

    toString()
    print all the Song information

    Create a separate class to create and test the Song objects


     */


    String name;
    double length;
    String artist;
    String genre;

    Double limit;

    public Song(String name,double length,String artist,String genre){

        this.name=name;
        this.length=length;
        this.artist=artist;
        this.genre=genre;






    }

    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length + " minutes"+
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }


    public void tooLong(){
        if(length>=4.00){
          limit+=length;
            System.out.println("Length is too long");



        }




    }




}
