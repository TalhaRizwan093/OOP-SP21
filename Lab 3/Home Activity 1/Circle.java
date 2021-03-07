
package l3h1;


public class Circle {
    
    public double radius;
    
    public Circle(){
        radius = 1;
    }
    
    public Circle(double rad){
        radius = rad;
    }
    
    double circumference(){
        double cur = 2*3.14*radius;
        return(cur);
        
    }
    
}
