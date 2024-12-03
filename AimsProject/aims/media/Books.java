
public class Book extends Media {
    private int id; 
    private String title; 
    private String category; 
    private float cost; 
    private List<String> authors = new ArrayList<String>(); 

    public Book (){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = new ArrayList<>();
    } 

    public Book(String title, float cost, String category) {
        super(title, cost);  // Gọi constructor của lớp cha Media
        this.category = category;
    }

    public int getId (){
        return id; 
    }

    // public void setId (int id){
    //     this.id = id;
    // }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }

    // public void setCategory(String category) {
    //     this.category = category;
    // }

    // Getter and Setter for cost
    public float getCost() {
        return cost;
    }

    // public void setCost(float cost) {
    //     this.cost = cost;
    // }

    public void addAuthor (){
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author \"" + authorName + "\" has been added.");
        } else {
            System.out.println("Author \"" + authorName + "\" is already in the list.");
        }
    }

    public void removeAuthor (){
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author \"" + authorName + "\" has been removed.");
        } else {
            System.out.println("Author \"" + authorName + "\" is not in the list.");
        }
    }
    

}