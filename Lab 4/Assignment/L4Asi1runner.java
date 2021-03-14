
package l4asi1;


public class L4Asi1runner {

    
    public static void main(String[] args) {
        
        HotDogStand h1 = new HotDogStand(1,0);
        HotDogStand h2 = new HotDogStand(2,3);
        HotDogStand h3 = new HotDogStand(3,6);
        
        h1.display();
        h1.justSold();
        
        h1.display();
        
        h2.justSold();
        
        h2.display();
        h3.display();
    }
    
}
