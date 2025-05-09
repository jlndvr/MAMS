package pck;

import java.util.ArrayList;
import java.util.List;

public class User implements Tools<Playlist> {

    private String username;
    private String password;
    private List<Playlist> playlists;
    private musicApp app;

    public User(String username, musicApp app) {
        this.username = username;
        this.playlists = new ArrayList<>();
        this.app = app;
    }
    // Can be overrided
    public String getName() {
        return username;
    }
    public void setPassword(String password) {
        this.password = String.valueOf(password.hashCode());
    }
    public String getPassword() {
        return password;
    }
    // Add
    @Override
    public void add(Playlist playlist) {
        playlists.add(playlist);
        app.incrementPlaylistCount();
    }
    // Remove
    @Override
    public void remove(Playlist playlist) {
        playlists.remove(playlist);
        app.decrementPlaylistCount();
    }
    // Finds single playlist by name and if it exists it returns the specified playlist object
    public Playlist findPlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(name)) {
                return playlist;
            }
        }
        return null; // Means "not found"
    }
    // Gets all playlists DO NOT DELETE SUPER IMPORTANT FOR APP INFO
    // Return type returns a list of playlist objects and how through and array list of playlist objects
    public List<Playlist> getPlaylists() {
        return playlists;
    }
}
