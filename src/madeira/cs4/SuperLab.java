package madeira.cs4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Author: SAANVI_PALADUGU
 * Superlabbbbbb :)
 * 9/23/2020
 **/


class Superlab {
    public static void main(String[] args) {

        try {
            File artistFile = new File("/Users/SaanviPaladugu/Downloads/artistList.txt");
            Scanner MyReader = new Scanner (artistFile);
            int numberArtists = MyReader.nextInt();
            String temp = MyReader.nextLine();
            String[] fileArtist = new String[numberArtists];
            int Rating=0;
            while (MyReader.hasNextLine()) {
                fileArtist[Rating] = MyReader.nextLine();
                Rating ++;
            }


            MyReader.close();
            Artist [] artistOne = new Artist [numberArtists];
            Rating=0;
            for(String line: fileArtist){
                artistOne[Rating] = new Artist();
                artistOne[Rating].setName(line.split(",")[0]);
                artistOne[Rating].setAlbum(line.split(",")[1]);
                artistOne[Rating].setTwitterhandle(line.split(",")[2]);
                Rating ++;
            }

            Scanner rate = new Scanner(System.in);
            Rating = 0;
            for(Artist line: artistOne){
                System.out.println("Rate "+  line.getName() +"out of ten.");
                int rating = rate.nextInt();
                artistOne[Rating].setRating(rating);
                Rating ++;
            }

            Rating = 0;
            for(Artist line: artistOne){

                System.out.println("Artist "+ line.getName()+
                        "has an album called " + line.getAlbum()+
                        "on their twitter handle " + line.getTwitterhandle()+
                        "has a rating of: " + artistOne[Rating].getRating());
                Rating ++;
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Error occured.");
            e.printStackTrace();
        }
    }
}


class Artist{

    String Name;
    String Album;
    String twitterhandle;
    int Rating;
    public Artist () {
        Name = "N/A";
        Album = "N/A";
        twitterhandle = "N/A";
        Rating = 0;
    }

    public void setName (String newname) { Name = newname;}
    public String getName () {return Name;}

    public void setAlbum (String newalbum) { Album = newalbum;}
    public String getAlbum () {return Album; }

    public void setTwitterhandle (String newtwitterhandle) { twitterhandle = newtwitterhandle;}
    public String getTwitterhandle () {return twitterhandle;}

    public void setRating (int newrating) { Rating = newrating;}
    public int getRating () {return Rating; }
}