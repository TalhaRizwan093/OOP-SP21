
package l4asi1;


public class HotDogStand {
    
    private int hotDogID;
    private int hotDogSold;
    
    HotDogStand(int hotDogID, int hotDogSold){
        
        this.hotDogID = hotDogID;
        this.hotDogSold = hotDogSold;
        
    }
    
    public void display(){
        
        System.out.println("Hotdogs sold by the stand ID: " + hotDogID + " are: " + hotDogSold);
        
    }
    
    public void justSold(){
        
        hotDogSold++;
        
    }
    
}
