
package l3asi1;

public class Marks {
    
    private int mark1;
    private int mark2;
    private int mark3;
    
    public Marks(){
        mark1 = 100;
        mark2 = 100;
        mark3 = 100;
    }
    
    public Marks(int m1, int m2, int m3){
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        
    }
    
    public int sum(){
        int sum = mark1 + mark2 + mark3;
        return(sum);
    }
    
}
