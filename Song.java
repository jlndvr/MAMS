package pck;

public class Song {

    private String name;
    private String artist;
    private String year;

    public Song(String name, String artist, String year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }
    // Get
    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist;
    }
    public String getYear() {
        return year;
    }
    
    // Plays a single song
    public void info() {
        System.out.println("Song: " + name + " by " + artist + " Release: " + year);
    }
}
