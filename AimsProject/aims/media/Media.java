public class Media {
    
    private int id; 
    private String title; 
    private String category; 
    private float cost; 

    //create the constructor of the Media class  
    public Media(String title, String category) {
        this.title = title;
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
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra tham chiếu
        if (this == obj) return true;

        // Kiểm tra null và kiểu dữ liệu
        if (obj == null || getClass() != obj.getClass()) return false;

        // Ép kiểu và so sánh thuộc tính
        Media media = (Media) obj;
        return Objects.equals(this.title, media.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    public static final Comparator<Media> COMPARE_BY_TITLE_COST =
            new MediaComparatorByTitleCost();

    public static final Comparator<Media> COMPARE_BY_COST_TITLE =
            new MediaComparatorByCostTitle();
}