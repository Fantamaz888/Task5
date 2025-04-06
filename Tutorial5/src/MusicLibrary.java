import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<String> tracks;
    private ArrayList<PlayList> playlists;

    public MusicLibrary() {
        this.tracks = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public void addTrack(String track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists in the library.");
        }
    }

    public void removeTrack(String track) {
        if (tracks.remove(track)) {
            for (PlayList playlist : playlists) {
                playlist.removeTrack(track);
            }
        } else {
            System.out.println("Track not found in the library.");
        }
    }

    public void displayTracks() {
        System.out.println("Tracks in the Music Library:");
        for (String track : tracks) {
            System.out.println("- " + track);
        }
    }

    public void searchTracks(String phrase) {
        System.out.println("Search results for \"" + phrase + "\":");
        for (String track : tracks) {
            if (track.toLowerCase().contains(phrase.toLowerCase())) {
                System.out.println("- " + track);
            }
        }
    }

    public void createPlaylist(String name) {
        if (findPlaylist(name) == null) {
            playlists.add(new PlayList(name));
        } else {
            System.out.println("Playlist already exists.");
        }
    }

    private PlayList findPlaylist(String name) {
        for (PlayList playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(name)) {
                return playlist;
            }
        }
        return null;
    }

    public void addTrackToPlaylist(String playlistName, String track) {
        PlayList playlist = findPlaylist(playlistName);
        if (playlist != null) {
            if (tracks.contains(track)) {
                playlist.addTrack(track);
            } else {
                System.out.println("Track not found in the library.");
            }
        } else {
            System.out.println("Playlist not found.");
        }
    }

    public void displayPlaylist(String name) {
        PlayList playlist = findPlaylist(name);
        if (playlist != null) {
            playlist.display();
        } else {
            System.out.println("Playlist not found.");
        }
    }

    public void displayAllPlaylists() {
        System.out.println("All Playlists:");
        for (PlayList playlist : playlists) {
            playlist.display();
        }
    }

}
