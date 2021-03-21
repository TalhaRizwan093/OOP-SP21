
package l5asi1;


public class L5Asi1Runner {

    
    public static void main(String[] args) {
        
        Fraction f = new Fraction(5,2);
        f.display();
        if(f.equals(1.2)){
            System.out.println("Both fractions are equal");
            
        }
        else
            System.out.println("Both fractions are different");
        
        System.out.println("Fraction of two integers is :" + f.get());
    }
    
}
