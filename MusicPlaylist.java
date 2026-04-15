import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Blinding Lights");
        playlist.add("Levitating");
        playlist.add("Perfect");

        System.out.println("Full Playlist:");
        display(playlist);

        if (!playlist.isEmpty()) {
            System.out.println("\nPlaying: " + playlist.removeFirst());
        }

        System.out.println("After playing first song:");
        display(playlist);

        if (!playlist.isEmpty()) {
            System.out.println("\nSkipping: " + playlist.removeLast());
        }

        System.out.println("After skipping last song:");
        display(playlist);
    }

    static void display(LinkedList<String> playlist) {
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}
