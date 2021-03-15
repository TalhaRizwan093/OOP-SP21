
package l5h1;


public class L5H1Runner {

    
    public static void main(String[] args) {
        
        Distance d1 = new Distance(5,6);
        Distance d2 = new Distance(10,16);
        Distance d3 = new Distance();
        d3 = d1.add(d2);
        
        d3.display();
        
    }
    
}
