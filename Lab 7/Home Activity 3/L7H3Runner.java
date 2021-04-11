
package l7h3;

public class L7H3Runner {

    
    public static void main(String[] args) {
        Point p1S = new Point(1.5,4.5);
        Point p1E = new Point(2.5,8.5);
        Line l1 = new Line(p1S,p1E);
        System.out.println("Length of line 1 is: " + l1.length());
        Point p2S = new Point(1.5,2.5);
        Point p2E = new Point(2.5,8.5);
        Line l2 = new Line(p2S,p2E);
        System.out.println("Length of line 2 is: " + l2.length());
    }
    
}
