package lesson20.Mentor.Spotify;

public class Rap implements Music{
    private final String title;
    private final String artist;
    private final int duration;

    public Rap(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void getDetails() {
        System.out.println(artist + " - " + title + ": " + duration + " seconds");
    }
}
