public class DigitalVideoDisc{
    private String title; 
    private String category; 
    private String director;
    private int length; 
    private float cost;  

    public DigitalVideoDisc(String title){

    }

    public void setTitle(String title) {
        this.title = title;
    }

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

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

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
}
