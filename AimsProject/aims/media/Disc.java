public class Disc extends Media{
    private int length; 
    private String director; 

    public int getLength(){
        return length; 
    }
    public int getDirector(){
        return director; 
    }

    public Disc(String title, String category, int length, String director) {
        super(title, category); // Call the constructor of the parent class (Media)
        this.length = length;
        this.director = director;
    }
}   