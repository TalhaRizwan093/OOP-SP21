
package l5h2;


public class L5H2Runner {

    
    public static void main(String[] args) {
        
        
        Book b1 = new Book();
        Book b2 = new Book("Talha", new String[] {"ab","ac","ab","ac","ab","ac","ab","ac"});
        b1.set("Talha", new String[] {"ab","ac","ab","ac","ab","ac"});
        boolean check1,check2;
        check1 = b1.compareBooks(b2);
        if(check1){
            System.out.println("Both books have same author");
            
        }
        else
            System.out.println("Both books have different author");
        check2 = Book.compareChapterNames(b1, b2);
        if(check2){
            b1.display();
            System.out.println(" Has larger number of chapters");
            
        }
        else{
            b2.display();
            System.out.println(" Has larger number of chapters");
        }
        
        
        
        
        
    }
    
}
