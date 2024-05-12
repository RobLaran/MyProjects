package OOP.MusicLibrary;

// Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.

// The “Song” class represents a song in a music library. It has two private instance variables, the title and the artist, and a constructor that takes these two variables as parameters. The class also provides getters and setters for the title and artist variables, allowing the client code to access and modify the song information.

// The above “MusicLibrary” class represents a library of songs. It uses an ArrayList to store the songs, and provides methods to add and remove songs from the library. It also has a method to get a list of all the songs in the library, and a method to play a random song from the library.

// The Main class creates an instance of MusicLibrary and adds several Song objects to it. It then retrieves and prints out the list of all songs in the library. Finally, it calls the playRandomSong() method of the MusicLibrary object three times to play a random song each time, printing out the details of the played song.

// Sample Output:

// All songs:
// Midnight Train to Georgia by Gladys Knight & the Pips
// Stairway to Heaven by Led Zeppelin
// Imagine by John Lennon
// All by Myself by Eric Carmen
// What'd I Say by Ray Charles
// Walking in Memphis by Marc Cohn
// In the Air Tonight by Phil Collins

// **Playing Random Song**
// Now playing: Imagine by John Lennon

// Now playing: Midnight Train to Georgia by Gladys Knight & the Pips

// Now playing: What'd I Say by Ray Charles

public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        Song song1 = new Song("Midnight Train to Georgia", "Gladys Knight & the Pips");
        Song song2 = new Song("Stairway to Heaven", "Led Zeppelin");
        Song song3 = new Song("Imagine", "John Lennon");
        Song song4 = new Song("All by Myself", "Eric Carmen");
        Song song5 = new Song("What'd I Say", "Ray Charles");
        Song song6 = new Song("Walking in Memphis", " Marc Cohn");
        Song song7 = new Song("In the Air Tonight", "Phil Collins");

        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);
        library.addSong(song4);
        library.addSong(song5);
        library.addSong(song6);
        library.addSong(song7);

        System.out.println("All Songs:");
        for(Song s: library.playlist()){
            System.out.print("Song Name: "); s.songInfo();
        }

        System.out.print("Now Playing: ");
        library.playRandomSong();

        System.out.print("Now Playing: ");
        library.playRandomSong();
        
        System.out.print("Now Playing: ");
        library.playRandomSong();

    }
}
