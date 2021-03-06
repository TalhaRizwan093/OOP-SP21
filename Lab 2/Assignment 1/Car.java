
package l2asi1;

import java.util.Scanner;


public class Car {
    
    private String carName;
    private String carColor;
    private String carCompany;
    private String carType;
    private int topSpeed;
    private int carSeats;
    
    public void setCarInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Car Name: ");
        carName = scan.next();
        System.out.print("Enter Car Color: ");
        carColor = scan.next();
        System.out.print("Enter Car Company: ");
        carCompany = scan.next();
        System.out.print("Enter Car Type (Hybrid or Petrol only): ");
        carType = scan.next();
        System.out.print("Set top speed: ");
        topSpeed = scan.nextInt();
        System.out.print("Set car seats: ");
        carSeats = scan.nextInt();
    }
    
    public void displayCarInfo(){
        System.out.println("Car name is: " + carName + "\n Car Color is: " + carColor + "\n Car Company is: " + carCompany + "\n Car type is: " + carType + "\n Car top speed is: " + topSpeed + "\n Number of seats is: " + carSeats );
    }
     
    
    
}
