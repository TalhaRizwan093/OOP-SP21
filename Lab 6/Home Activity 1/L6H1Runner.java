
package l6h1;


public class L6H1Runner {

    
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(3);
        System.out.println("Monthly interest rate is: "+saver1.calculateMonthlyInterest());
        System.out.println("Monthly interest rate is: "+saver2.calculateMonthlyInterest());
        SavingsAccount.modifyInterestRate(4);
        System.out.println("Next Month rate is: "+saver1.calculateMonthlyInterest());
        System.out.println("Next Month rate is: "+saver2.calculateMonthlyInterest());
    }
    
}
