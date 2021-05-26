
package l11asi1;

import java.util.Scanner;


public class L11Asi1Runner {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Shape[] shapes = new Shape[100];
        shapes[0] = new Circle(2.1);
        shapes[1] = new Circle(3.1);
        shapes[2] = new Circle(4.1);
        shapes[3] = new Triangle(2.1,4.0);
        shapes[4] = new Triangle(2.1,6.3);
        shapes[5] = new Triangle(2.6,1.1);
        shapes[6] = new Rectangle(2.1,4.0);
        shapes[7] = new Rectangle(2.1,6.3);
        shapes[8] = new Rectangle(2.6,1.1);
        
        
        CalculateAreas allShapes = new CalculateAreas(shapes);
        allShapes.calArea();
        System.out.println(allShapes.toString());
        
        
        
    }
    
}
