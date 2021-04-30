
package l9h1;

import java.util.Scanner;


public class L9H1Runner {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfDays;
        Action a = new Action("PG-12",1,"ABC");
        Comedy c = new Comedy("PG-16",1,"DEF");
        if(c.equals(a)){
            System.out.println("Both movies are same");
        }
        else
            System.out.println("Both movies are different");
        
        System.out.println("Enter number of days you used the movie " + a.getMovieTitle() + ":");
        numOfDays = scan.nextInt();
        System.out.println("You have to pay: " + a.calcLateFees(numOfDays) + " For movie: "+a.getMovieTitle());
        
        
        
    }
    
}
