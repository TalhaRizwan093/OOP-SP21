
package l2asi2;

import java.util.Scanner;


public class Rectangle {
    
    private int rectWidth = 1;
    private int rectHeight = 1;
    private int area = rectWidth * rectHeight;
    
    public void setRectPara(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Width of rectangle: ");
        rectWidth = scan.nextInt();
        System.out.println("Enter Height of rectangle: ");
        rectHeight = scan.nextInt();
    }
    
    
    public void rectArea(){
        
        area = rectWidth * rectHeight;
        
        
    }
    
    public void displayRectInfo(){
        System.out.println("Rectangle Width is: " + rectWidth + "\nRectangle Height is: " + rectHeight + "\nTotal Area of Rectangle is: " + area);
    }
    
}
