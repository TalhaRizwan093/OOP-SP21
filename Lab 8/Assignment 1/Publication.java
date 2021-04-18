
package l8ai1;


public class Publication {
    
    private String title;
    private int price;

    public Publication() {
        title = "";
        price = 0;
    }

    public Publication(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String display() {
        return "title:" + title + " price:" + price;
    }
    
    
    
}
