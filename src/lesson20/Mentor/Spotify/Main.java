package lesson20.Mentor.Spotify;

public class Main {
    public static void main(String[] args) {
        Playlist<Music> musicPlaylist = new Playlist<>();
        musicPlaylist.addToList(new Rap("Galiba", "Sagopa Kajmer", 300));
        musicPlaylist.addToList(new Folk("Qal Sənə Qurban", "Nəzakət Teymurova", 420));
        musicPlaylist.addToList(new Pop("Bayatılar", "Brilliant Dadaşova", 350));

        Playlist<Podcast> podcastPlaylist = new Playlist<>();
        podcastPlaylist.addToList(new Podcast("PodX", 3600));
        podcastPlaylist.addToList(new Podcast("PodY", 3600));

        musicPlaylist.printDetails();
        podcastPlaylist.printDetails();
    }
}
