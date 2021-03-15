
package l5h1;


public class Distance {
    
    private double feet;
    private double inches;
    
    Distance(){
        
        feet = 0;
        inches = 0;
    }    
    
    Distance(double feet, double inches){
        
        this.feet = feet;
        this.inches = inches;
        
    }
    
    public void set(double feet, double inches){
        
        this.feet = feet;
        this.inches = inches;
        
    }
    
    public void display(){
        
        System.out.println("Distance is: " + feet + " feet and: "+ inches + " inches.");
        
    }
    
    public Distance add(Distance ob2){
        
        Distance d_new = new Distance(feet + ob2.feet, inches + ob2.inches);
        return (d_new);
        
    }
}
