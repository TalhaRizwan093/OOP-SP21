
package l7h2;


public class Book {
    
    private Person author;
    private String bookName;
    private String publisher;
    
    Book(Person author, String bookName, String publisher){
        this.author = author;
        this.bookName = bookName;
        this.publisher = publisher;
    }
    
    public void setPerson(Person author){
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void display(){
        author.display();
        System.out.println("Book Name: " + this.bookName + " Publisher : " + this.publisher);
    }
}
