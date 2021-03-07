
package l3h2;


public class L3H2runner {


    public static void main(String[] args) {
        
        Account a1 = new Account();
        a1.withdraw(500);
        a1.deposit(200);
        Account a2 = new Account(100000);
        a2.withdraw(50000);
        a2.deposit(20000);
       
    }
    
}
