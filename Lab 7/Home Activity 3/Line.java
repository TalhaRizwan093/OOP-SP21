
package l7h3;


public class Line {
    
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    
    public double length(){
        double len;
        len = Math.pow(endPoint.getxCord() - startPoint.getxCord(), 2) + Math.pow(endPoint.getyCord() - startPoint.getyCord(), 2);
        return Math.sqrt(len);
    }
    
    
}
