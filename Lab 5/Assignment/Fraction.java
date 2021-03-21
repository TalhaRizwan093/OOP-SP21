
package l5asi1;


public class Fraction {
    
    private int integer1;
    private int integer2;
    
    Fraction(){
        integer1 = 2;
        integer2 = 2;
        
    }
    
    Fraction(int integer1, int integer2){
        
        this.integer1 = integer1;
        this.integer2 = integer2;
        
    }
    
    public void set(int integer1, int integer2){
        this.integer1 = integer1;
        this.integer2 = integer2;
    }
    public double get(){
        return (double) integer1/(double) integer2;
    }
    public void display(){
        double fraction;
        System.out.println("Integer 1 is: "+ integer1);
        System.out.println("Integer 2 is: "+ integer2);
        fraction = (double) integer1/(double) integer2;
        System.out.println("The ratio of two integers is: "+ fraction);
    }
    
    public boolean equals(double fraction){
        double fract1;
        fract1 = integer1/integer2;
        return fract1 == fraction;
        
        
    }
}
