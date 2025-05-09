package pck;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Tools<Song> {

    private String name;
    private List<Song> songs = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }
    // May use override
    public String getName() {
        return name;
    }
    @Override
    public void add(Song song) {
        songs.add(song);
    }
    @Override
    public void remove(Song song) {
        songs.remove(song);
    }
    // Will output all songs 
    public void info() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            song.info();
        }
    }
}
