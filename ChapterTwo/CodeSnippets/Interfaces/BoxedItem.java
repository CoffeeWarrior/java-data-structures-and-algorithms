package JavaTextBook.ChapterTwo.CodeSnippets.Interfaces;

public class BoxedItem implements Sellable, Transportable {
    //this class is an example of a class implementing multiple interfaces
    private String description;
    private int price;
    private int weight;
    private boolean hazardous;
    private int height = 0; //box height in cm
    private int width = 0; //box width in cm
    private int depth = 0; //box depth in cm

    public BoxedItem(String description, int price, int weight, boolean hazardous){
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.hazardous = hazardous;
    }

    public String description(){ return description; }
    public int listPrice(){ return price; }
    public int lowestPrice(){ return price/2; }
    public int weight(){ return weight; }
    public boolean isHazardous(){ return hazardous; }
    public int insuredValue(){ return price*2; }
    public void setBox(int h, int w, int d){
        height = h;
        width = w;
        depth = d;
    }
    public int getVolume(){
        return height*width*depth;
    }
}
