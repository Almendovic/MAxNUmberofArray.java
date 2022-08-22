package day12_Switch;

public class Author {
    public static void main(String[] args) {

        String genre="Fantasy";
        int pageLength=0;
        int profit=0;
        int sequels=0;
        int countries=0;


        switch (genre){
            case "Fantasy":
                pageLength=500;
                profit=1_000_000;
                sequels=5;
                countries=50;
                break;
            case "Detective":
                pageLength=350;
                profit =700_000;
                sequels=3;
                countries=45;
                break;
            case "Science Fiction":
                pageLength=720;
                profit=900_000;
                sequels=4;
                countries=30;
                break;
            case "Short Story":
                pageLength=150;
                profit=300_000;
                sequels=1;
                countries=40;
                break;

        }
        System.out.println("Genre is : " + genre + " and  has "+ pageLength + " pages length and profited " +profit + "$ and had " + sequels +" sequels and sold  in " + countries + " countries" );






    }
}
