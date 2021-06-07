
package l14h1;

import java.io.*;

public class L14H1Runner {

    
    public static void main(String[] args) {
        
        Person p1 = new Person("Talha", 20);
        Person p2 = new Person("Osama", 20);
        Person p3 = new Person("ALi", 20);
        Person p4 = new Person("Usman", 20);
        Person p5 = new Person("AR", 20);
        Book b1 = new Book(p1,"ABC","Publisher");
        Book b2 = new Book(p2,"a","Publisher");
        Book b3 = new Book(p3,"ABC","Publisher");
        Book b4 = new Book(p4,"ABC","Publisher");
        Book b5 = new Book(p5,"ABC","Publisher");
        
        try{
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("BookStore"));
            o.writeObject(b1);
            o.writeObject(b2);
            o.writeObject(b3);
            o.writeObject(b4);
            o.writeObject(b5);
            
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        try{
            ObjectInputStream i = new ObjectInputStream(new FileInputStream("BookStore"));
            while(true){
                Book book = (Book) i.readObject();
                System.out.println(book.getAuthor());
                System.out.println(book.getName());
                System.out.println(book.getPublisher());
            }   
            
            
        }catch(EOFException eof){
            System.out.println("Reached end of file");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        searchRecord("a");
    
    
}
    public static void searchRecord(String bookName){
        try{
            ObjectInputStream i = new ObjectInputStream(new FileInputStream("BookStore"));
            while(true){
                Book book = (Book) i.readObject();
                if(book.getName().equals(bookName)){
                    System.out.println(book.getAuthor());
                    System.out.println(book.getName());
                    System.out.println(book.getPublisher());
                }
            }   
            
            
        }catch(EOFException eof){
            System.out.println("Reached end of file");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
