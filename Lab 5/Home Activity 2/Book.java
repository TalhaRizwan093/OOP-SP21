
package l5h2;


public class Book {
    
    private String author;
    private String[] chapterNames = new String[100];
    
    Book(){
        
        author = "";
        chapterNames = new String[] {};
        
        
    }
    
    Book(String author, String[] chapterNames) {
        
        this.author = author;
        this.chapterNames = chapterNames;
        
    }
    
    public boolean compareBooks(Book b){
        
        if (author == b.author){
            return true;
        }
        else
            return false;
        
    }
    
    public static boolean compareChapterNames(Book b1,Book b2){
        int len1,len2;
        len1 = b1.chapterNames.length;
        len2 = b2.chapterNames.length;
        
        if(len1 > len2){
            return true;
        }
        else
            return false;
            
        
        
        
        
    }
    
    public void set(String author, String[] chapterNames){
        
        this.author = author;
        this.chapterNames = chapterNames;
        
    }
    
    public void display(){
        System.out.print(author);
    }
}
