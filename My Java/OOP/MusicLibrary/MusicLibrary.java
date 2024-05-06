package OOP.MusicLibrary;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    Random rand = new Random();

    private ArrayList<Song> songs;

    public MusicLibrary(){
        songs = new  ArrayList<Song>();
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(Song song){
        songs.remove(song);
    }

    public ArrayList<Song> playlist(){
        return songs;
    }

    public void playRandomSong(){
        songs.get(rand.nextInt(songs.size())).songInfo();
    }
}
