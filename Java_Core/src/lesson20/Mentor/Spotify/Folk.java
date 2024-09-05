package lesson20.Mentor.Spotify;

public class Folk implements Music {
    private final String title;
    private final String artist;
    private final int duration;

    public Folk(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void getDetails() {
        System.out.println(artist + " - " + title + ": " + duration + " seconds");
    }
}
