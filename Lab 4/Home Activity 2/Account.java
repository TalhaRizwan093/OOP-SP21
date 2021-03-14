
package l4h2;


public class Account {
    
    private int balance;
    
    public Account(){
        balance = 0;
    }
    
    public Account(int bal){
        balance = bal;
    }
    
    public void withDraw(int withdrawAmount){
        
        balance = balance - withdrawAmount;
        
    }
    
    public void deposit(int depositAmount){
        
        balance = balance + depositAmount;
        
    }
    
    public int getBalance(){
        
        return balance;
        
    }
    
    
    
}
