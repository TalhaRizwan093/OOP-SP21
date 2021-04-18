
package l8ai1;

import java.util.Scanner;

public class L8Ai1Runner {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int playTimeMinutes, price, pageCount, choice;
        String title;
        while(true){
            System.out.println("-------Book and Tape Publication-------");
            System.out.println("Press");
            System.out.println("1. For the Book");
            System.out.println("2. For the Tape");
            System.out.println("0. To Exit");
            System.out.println("Enter Choice: ");
            choice = scan.nextInt();
            
            switch(choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Enter Book Name: ");
                    title = scan.next();
                    System.out.println("Enter Book price: ");
                    price = scan.nextInt();
                    System.out.println("Enter Number of pages: ");
                    pageCount = scan.nextInt();
                    Book b = new Book(title,price,pageCount);
                    System.out.println(b.display());
                    System.out.println("Published successfully");
                    break;
                case 2:
                    System.out.println("Enter Tape Name: ");
                    title = scan.next();
                    System.out.println("Enter Tape price: ");
                    price = scan.nextInt();
                    System.out.println("Enter Number of Minutes your tape have: ");
                    playTimeMinutes = scan.nextInt();
                    Tape t = new Tape(playTimeMinutes,title,price);
                    System.out.println(t.display());
                    System.out.println("Published successfully");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            
            
        }
        
        
    }
    
}
