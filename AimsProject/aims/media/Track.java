public class Track implements Playable{
    private String title; 
    private int length; 

    public int getLength(){
        return length; 
    }
    public int getTitle(){
        return Title; 
    }

    public Track(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost; 
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public boolean equals(Object obj) {
        // Kiểm tra tham chiếu
        if (this == obj) return true;

        // Kiểm tra null và kiểu dữ liệu
        if (obj == null || getClass() != obj.getClass()) return false;

        // Ép kiểu và so sánh thuộc tính
        Track track = (Track) obj;
        return Objects.equals(this.title, track.title) && this.length == track.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length);
    }
}