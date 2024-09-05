package lesson20.Mentor.Spotify;

import java.util.LinkedList;
import java.util.List;

public class Playlist <T extends Playable> {
    private final List<T> playlistItems;

    public Playlist() {
        this.playlistItems = new LinkedList<>();
    }

    public void addToList(T playable) {
        playlistItems.add(playable);
    }

    public void printDetails() {
        for (T item: playlistItems) {
            item.getDetails();
        }
    }
}
