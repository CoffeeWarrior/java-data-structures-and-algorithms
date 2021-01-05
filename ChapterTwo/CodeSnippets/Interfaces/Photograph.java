package JavaTextBook.ChapterTwo.CodeSnippets.Interfaces;

public class Photograph implements Sellable {
    private String description;
    private int price;
    private boolean color;

    public Photograph(String description, int p, boolean c){
        this.description = description;
        this.price = p;
        this.color = c;
    }
    public String description(){ return description; }
    public int listPrice(){ return price; }
    public int lowestPrice(){ return price/2; }
    public boolean isColor(){ return color; }
}
