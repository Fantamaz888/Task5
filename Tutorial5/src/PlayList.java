import java.util.ArrayList;



public class PlayList {
    private ArrayList<String> tracks;
    private String name;

    public PlayList(String name) {
        this.name = name;
        tracks = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void addTrack(String track){
        if (!tracks.contains(track)) {
            this.tracks.add(track);
        } else {
            System.out.println("Track already exists in playlist" + this.name);
        }
    }
    public void removeTrack(String track){
        boolean isRemoved = this.tracks.remove(track);
        if (!isRemoved) {
            System.out.println("Track does not exist in playlist" + this.name);
        }
    }
    public void display(){
        System.out.println("Tracks in playlist " + this.name);
        if (this.tracks.isEmpty()) {
            System.out.println("No tracks in playlist " + this.name);
        } else {
            for (String track : this.tracks)
                System.out.println("-" + track);
        }
    }

}





