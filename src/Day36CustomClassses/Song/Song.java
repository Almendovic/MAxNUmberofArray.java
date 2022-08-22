package Day36CustomClassses.Song;

public class Song {

String name;
double length;
String artist;
String genre;

public Song(String name,double length){
    this.name=name;
    this.length=length;

}




    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Song(String name, double length, String artist, String genre){

    this.name=name;
    this.length=length;
    this.artist=artist;
    this.genre=genre;




}



}
