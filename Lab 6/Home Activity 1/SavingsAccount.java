
package l6h1;


public class SavingsAccount {
    
    private static double annualInterestRate;
    private int savingBalance;
    
    SavingsAccount(int savingBalance){
       
        this.savingBalance = savingBalance;
        
    }
    
    public double calculateMonthlyInterest(){
        
        return (annualInterestRate * savingBalance )/ 12;
        
        
    }
    
    public static void modifyInterestRate(double interestRate){
        
        annualInterestRate = interestRate;
    
    }
    
}
