
package l3h3;

public class Distance {
    
    private double feet;
    private double inches;
    
    public Distance(){
        feet = 1;
        inches = 2;
        
    }
    
    public Distance(double feet_, double inches_){
        feet = feet_;
        inches = inches_;
    }
    
    public void displayDistance(){
        System.out.println("Distance is: "+ feet + " feet and: " + inches);
    }
    
}
