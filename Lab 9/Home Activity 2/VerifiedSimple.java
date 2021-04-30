
package l9h2;

public class VerifiedSimple extends Simple {    
    
    public VerifiedSimple(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double div() {
        if(num1>0){
            return super.div();
        }
        else{
            System.out.println("Enter value greater then Zero");
            return 0;
        }
        
    }

    @Override
    public double mul() {
        if(num1>0){
            return super.mul();
        }
        else{
            System.out.println("Enter value greater then Zero");
            return 0;
        }
        
    }

    @Override
    public double sub() {
        if(num1>0){
            return super.sub();
        }
        else{
            System.out.println("Enter value greater then Zero");
            return 0;
        }
    }

    @Override
    public double add() {
        if(num1>0){
            return super.add();
        }
        else{
            System.out.println("Enter value greater then Zero");
            return 0;
        }
    }
    
    
    
    
}
