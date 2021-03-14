
package l4h2;


public class L4H2Runner {

    
    public static void main(String[] args) {
        
        Account a1 = new Account(25000);
        Account a2 = new Account(25000);
        
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        
        a1.deposit(1000);
        a2.withDraw(5000);
        
        System.out.println("New Amount " + a1.getBalance());
        System.out.println("New Amount " + a2.getBalance());
        
        
        
    }
    
}
