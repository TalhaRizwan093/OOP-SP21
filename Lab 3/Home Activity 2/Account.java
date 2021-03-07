
package l3h2;


public class Account {
    
    private double balance;
    
    public Account(){
        balance = 1000;
    }
    
    public Account(double bal){
        balance = bal;        
    }
    
    public void withdraw(double withDraw){
        balance = balance - withDraw;
        System.out.println("Your new balance is: "+ balance);
    }
    
    public void deposit(double deposit){
        balance = balance + deposit;
        System.out.println("Your new balance is: "+ balance);
    }
    
}
