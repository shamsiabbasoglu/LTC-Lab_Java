package lesson12.Mentor.SongComparer;

public class Playlist {
    private final Song[] songs;
    private final int capacity;
    private int songCount;

    public Playlist(int capacity) {
        this.capacity = capacity;
        this.songs = new Song[capacity];
        this.songCount = 0;
    }

    public void addSong(Song song) {
        if (songCount < capacity) {
            songs[songCount] = song;
            songCount++;
        } else {
            System.out.println("Playlist is full. Cannot add more songs.");
        }
    }

    public void displaySongs() {
        System.out.println("Songs in the playlist:");
        for (int i = 0; i < songCount; i++) {
            System.out.println(songs[i].getTitle() + " by " + songs[i].getArtist() +
                    " (Duration: " + songs[i].getDuration() + " seconds)");
        }
    }
    public static void main(String[] args) {
        Playlist playlist = new Playlist(10);
        Song song1 = new Song();
        song1.setTitle("Shape of You");
        song1.setArtist("Ed Sheeran");
        song1.setDuration(240);
        Song song2 = new Song();
        song2.setTitle("Blinding Lights");
        song2.setArtist("The Weekend");
        song2.setDuration(210);

        playlist.addSong(song1);
        playlist.addSong(song2);

        playlist.displaySongs();
    }
}