
package h1a2;

import java.util.Scanner;


public class Time {
    Scanner scan = new Scanner(System.in);
    private int hours;
    private int minutes;
    private int seconds;
    
    public void setTime(){
        System.out.print("Enter student Hours: ");
        hours = scan.nextInt();
        System.out.print("Enter student Minutes: ");
        minutes = scan.nextInt();
        System.out.print("Enter student Seconds: ");
        seconds = scan.nextInt();
        
    }
    
    public void displayTime(){
        System.out.println("The time is:  "+hours+":"+minutes+":"+seconds);
    }
    
}
