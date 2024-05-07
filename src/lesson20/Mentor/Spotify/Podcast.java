package lesson20.Mentor.Spotify;

public class Podcast implements Playable {
    private final String title;
    private final int duration;


    public Podcast(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }


    @Override
    public void getDetails() {
        System.out.println(title + ": " + duration + " seconds");
    }
}
