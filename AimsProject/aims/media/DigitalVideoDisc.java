public class DigitalVideoDisc extends Disc implements Playable{
    private String title; 
    private String category; 
    private String director;
    private int length; 
    private float cost;  

    public DigitalVideoDisc(String title){

    }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    private static int nbDigitalVideoDiscs = 0; 
    private int id; 

    public toString (){
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " mins: " + cost + " $"; 
    }

    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);  // Case-insensitive comparison
    }


    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getDirector() {
        return director;
    }

    // public Books (String id, String title, String category, String content_length, String Author_list){
    //     this.id = id; 
    //     this.title = title;
    //     this.category = category;
    //     this.content_length = content_length; 
    //     this.Author_list = Author_list; 
    // }

    // public CDs (String title, String category, String director, int length, float cost, string artist){
    //     this.title = title;
    //     this.category = category;
    //     this.director = director;
    //     this.artist = artist; 
    //     this.length = length;
    //     this.cost = cost;
    // }

    public String getCategory() {
        return category;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
