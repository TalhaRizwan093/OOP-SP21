
package l14h1;
import java.io.*;


public class Book implements Serializable {
    
    private String name;
    private String publisher;
    private Person author;

    public Book( Person author, String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author.getName() + " " + author.getAge();
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }
    
    
    
}
