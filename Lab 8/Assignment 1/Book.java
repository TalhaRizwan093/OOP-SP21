
package l8ai1;


public class Book extends Publication{
    
    private int pageCount;

    public Book() {
        pageCount = 0;
    }

    public Book(String title, int price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
        
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String display() {
        return super.display() + " Book pages are: " + pageCount;
    }
    
    
    
    
    
    
}
