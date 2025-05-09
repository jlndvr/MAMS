import pck.Playlist;
import pck.Song;
import pck.User;
import pck.musicApp;

public class Main {
    public static void main(String[] args) {

        // Create new app
        musicApp Spotify = new musicApp();

        // Add songs to app
        Song song1 = new Song("Lose Yourself", "Eminem", "2002");
        Song song2 = new Song("Perro Negro", "Bad Bunny", "2024");
        Song song3 = new Song("Ferxxo 100", "Feid", "2024");
        Song song4 = new Song("EL CLúB", "Bad Bunny", "2025");
        Song song5 = new Song("DtMF", "Bad Bnunny", "2025");
        Song song6 = new Song("TURiSTA", "Bad Bunny", "2025");
        Song song7 = new Song("BOKeTE", "Bad Bunny", "2025");
        Song song8 = new Song("Mirame - Remix", "Nio Garcia, Rauw Alejandro, Lenny Tavárez, Myke Towers, Casper Magico, Darell", "2024");
        Song song9 = new Song("Ay Vamos - Remix", "J Balvin, Nicky Jam, French Montana", "2014");
        Song song10 = new Song("El Amante", "Nicky Jam, Ozuna, Bad Bunny", "2017");

        // There are 10 total songs now in the Spotify object
        Spotify.add(song1);
        Spotify.add(song2);
        Spotify.add(song3);
        Spotify.add(song4);
        Spotify.add(song5);                       
        Spotify.add(song6);
        Spotify.add(song7);
        Spotify.add(song8);
        Spotify.add(song9);
        Spotify.add(song10);

        // Create users
        User user1 = new User("Jlndvr", Spotify);
        User user2 = new User("Norman", Spotify);
        User user3 = new User("Ismael", Spotify);

        // Set password for fun to show hashCode use
        user1.setPassword("iAmCool");
        // Displays hashed password of user
        System.out.println("Hashed password: " + user1.getPassword());

        // 3 users currently in Spotify app
        // Spotify.add(user1);
        // Spotify.add(user2);
        // Spotify.add(user3);

        // Create a playlist 
        Playlist p1 = new Playlist("Study Music");

        // Add playlist to user list of playlists
        user1.add(p1);

        // Add songs into playlist
        p1.add(song1);
        p1.add(song2);
        p1.add(song3);
        p1.add(song4);
        p1.add(song5);
        p1.add(song6);
        p1.add(song7);
        p1.add(song8);
        p1.add(song9);
        p1.add(song10);

        // Playlist info
        p1.info();
        System.out.println();
        
        // Remove song from playlist leaving 9 in playlist but app still has 10
        p1.remove(song5);

        // Prints 9 songs
        p1.info();
        System.out.println();

        // Display info with users playlists and songs
        Spotify.info();
        System.out.println();

        // Show what song1 is
        song1.info();

        // Search for playlist and check if it exists 
        // if == null means the reference isn’t pointing to any heap object (no heap address)
        // else a valid memory address was found for an object
        Playlist result = user1.findPlaylist("Study Music");
        if (result != null) System.out.println("Playlist found: " + result.getName()); 
        else System.out.println("Playlist not found.");

    }
}
