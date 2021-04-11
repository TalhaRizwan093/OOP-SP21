
package l7h3;


public class Point {
    
    private double xCord;
    private double yCord;

    public Point(double xCord, double yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public void setxCord(double xCord) {
        this.xCord = xCord;
    }

    public void setyCord(double yCord) {
        this.yCord = yCord;
    }

    public double getxCord() {
        return xCord;
    }

    public double getyCord() {
        return yCord;
    }
    
    public void display(){
        System.out.println("X cord is: " + xCord + " Y cord is: " + yCord);
    }
    
    
    
    
}
