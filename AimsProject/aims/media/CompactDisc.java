public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>(); 

    public String getArtist (){ 
        return artist; 
    }

    public CompactDisc(String title, String category, int length, String director, String artist) {
        super(title, category, length, director);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track \"" + track.getTitle() + "\" is already in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track \"" + track.getTitle() + "\" added to the list.");
        }
    }

    // Method to remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track \"" + track.getTitle() + "\" removed from the list.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" is not in the list.");
        }
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    @Override
    public void play() {
        System.out.println("Playing Compact Disc: " + this.getTitle() + " by " + this.getArtist());
        for (Track track : tracks) {
            track.play(); // Gọi phương thức play() của từng Track
        }
    }

    
}

