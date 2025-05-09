package pck;

// Dynamic array 
import java.util.ArrayList;
import java.util.List;

// Controller 
public class musicApp {

    private int songCount = 0;
    private int userCount = 0;
    private int playlistCount = 0;

    private List<User> users;
    private List<Song> songs;

    public musicApp() {
        users = new ArrayList<>();
        songs = new ArrayList<>();
    }
    // Add
    public void add(User user) {
        users.add(user);
        ++userCount;
    }
    public void add(Song song) {
        songs.add(song);
        ++songCount;
    }
    // Remove
    public void remove(User user) {
        users.remove(user);
        --userCount;
    }
    public void remove(Song song) {
        songs.remove(song);
        --songCount;
    }
    // Display application info
    public void info() {
    System.out.println("- Users -");
        for (User user : users) {
        System.out.println(user.getName());
        }
        for (User user : users) {
        for (Playlist playlist : user.getPlaylists()) {
            System.out.println("- Playlists - \n" + playlist.getName());
        }
    }
    System.out.println("- Songs -");
    for (Song song : songs) {
        System.out.println("Song: " + song.getName() + " Artist: " + song.getArtist() + " Year: " + song.getYear());
    }
    System.out.println("Users: " + userCount + " Songs: " + songCount + " Playlists: " + playlistCount);
    }
    // Increment/decrement playlist count
    public void incrementPlaylistCount() {
        ++playlistCount;
    }
    public void decrementPlaylistCount() {
        --playlistCount;
    }
}