
package l14a;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class L14ARunner {

    
    public static void main(String[] args) throws ClassNotFoundException{
        Scanner scan = new Scanner(System.in);
        int accountNumber, choice, withdrawAmount, depositAmount, accountNumReci;
        boolean exist = false, existTrans = false;
        ArrayList<Account> accounts = new ArrayList();
        accounts.add(new Account(1,1000));
        accounts.add(new Account(2,2000));
        accounts.add(new Account(3,3000));
        accounts.add(new Account(4,4000));
        accounts.add(new Account(5,5000));
        accounts.add(new Account(6,6000));
        accounts.add(new Account(7,7000));
        accounts.add(new Account(8,8000));
        accounts.add(new Account(9,9000));
        accounts.add(new Account(10,10000));
        try{
            ObjectOutputStream act = new ObjectOutputStream(new FileOutputStream("Accounts",true));
            for(int i = 0;i < accounts.size() ; i++){
                act.writeObject(accounts.get(i));
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
//        try{
//            ObjectInputStream actRead = new ObjectInputStream(new FileInputStream("Accounts"));
//            for(int i = 0;i < accounts.size() ; i++){
//                Account account = (Account) actRead.readObject();
//                System.out.println("Account number" + account.getAccountNumber());
//                System.out.println("Account Amount" + account.getAmount());
//            }
//        }catch(IOException ex){
//            ex.printStackTrace();
//        }
//        
        
        
        
        while(true){
            System.out.println("Welcome to ATM");
            System.out.println("1. To enter your account number");
            System.out.println("0. To exit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            switch(choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Enter account number: ");
                   accountNumber = scan.nextInt();
                    for(int i = 0;i < accounts.size() ; i++){
                        if(accounts.get(i).getAccountNumber() == accountNumber)
                            exist = true;
                        } 
                    while(true){
                        if(exist){
                            System.out.println("Chose which operations you want to do:");
                            System.out.println("1. To Inquir Account");
                            System.out.println("2. To WithDraw Cash");
                            System.out.println("3. To deposit cash");
                            System.out.println("4. To transfer money");
                            System.out.println("0. To enter new card number");
                            System.out.println("Enter choice");
                            choice = scan.nextInt();
                            if(choice == 0){
                                break;
                            }
                        switch(choice){
                            case 1:
                                balanceInquiry(accountNumber, accounts);
                                break;
                            case 2:
                                System.out.println("How much money you want to withdraw: ");
                                withdrawAmount = scan.nextInt();
                                withdraw(accountNumber, accounts, withdrawAmount);
                                //balanceInquiry(accountNumber, accounts);
                                break;
                            case 3:
                                System.out.println("How much money you want to Deposit: ");
                                depositAmount = scan.nextInt();
                                deposit(accountNumber, accounts, depositAmount);
                                //balanceInquiry(accountNumber, accounts);
                                break;
                            case 4:
                                
                                System.out.println("Enter account number where you want to transfer: ");
                                accountNumReci = scan.nextInt();
                                for(int i = 0;i < accounts.size() ; i++){
                                    if(accounts.get(i).getAccountNumber() == accountNumReci)
                                        existTrans = true;
                                }
                                if(existTrans){
                                    transfer(accountNumber,accountNumReci,accounts);
                                    System.out.println("Money successfully transfered");
                                }
                                else
                                    System.out.println("Reciving account doesnt exist");
                                break;
                                    
                            default:
                                System.out.println("Wrong choice");
                            }
                        }
                        else{
                            System.out.println("Account doesnot exist");
                            break;
                        }

                    }
                default:
                       System.out.println("Wrong choice");
            }
            
            
    }
        
        
        
    }
    
    public static void balanceInquiry(int accountNumber, ArrayList<Account> accounts){
        try{
            
            ObjectInputStream actInput = new ObjectInputStream(new FileInputStream("Accounts"));
            for(int i = 0; i<accounts.size() ; i++){
                Account account = (Account) actInput.readObject();
                if(account.getAccountNumber() == accountNumber){
                    System.out.println("Account Details");
                    System.out.println("Your account has following ammount" + account.getAmount());
                }
        }
        }
        catch (EOFException ex) {
            System.out.println("End of file reached.");
        } catch(ClassNotFoundException ex) {
             ex.printStackTrace();
        } catch(FileNotFoundException ex) {
        ex.printStackTrace();
        } catch(IOException ex) {
        ex.printStackTrace();
             }
        }
    
    public static void withdraw(int accountNumber, ArrayList<Account> accounts, int withdrawAmount){
        int totalAmount;
        try{
        ObjectOutputStream act = new ObjectOutputStream(new FileOutputStream("Accounts"));
            for(int i = 0; i<accounts.size() ; i++){
                
                if(accounts.get(i).getAccountNumber() == accountNumber){
                    totalAmount = accounts.get(i).getAmount();
                    totalAmount -= withdrawAmount;
                    if(totalAmount > 0){
                        accounts.get(i).setAmount(totalAmount);
                        System.out.println("Money is being deducted your new balance is: " + totalAmount);
                    }
                    else{
                        System.out.println("You dont have enough money");
                    }
                }
            }
            for(int i = 0; i<accounts.size() ; i++){
                
               act.writeObject(accounts.get(i));
            }
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }    
    }
    
    public static void deposit(int accountNumber, ArrayList<Account> accounts, int depositAmount){
        int totalAmount;
        try{
            ObjectOutputStream act = new ObjectOutputStream(new FileOutputStream("Accounts"));
            
            for(int i = 0; i<accounts.size() ; i++){
                
                if(accounts.get(i).getAccountNumber() == accountNumber){
                    totalAmount = accounts.get(i).getAmount();
                    totalAmount += depositAmount;
                    accounts.get(i).setAmount(totalAmount);
                    System.out.println("Money is being added your new balance is: " + totalAmount);
                    
                }
            }
            for(int i = 0; i<accounts.size() ; i++){
               act.writeObject(accounts.get(i));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
        
    }
    
    public static void transfer(int account1 , int account2 , ArrayList<Account> accounts){
        Scanner scan = new Scanner(System.in);
        int tAmount, currentAmount;
        System.out.println("How much money do you want to transfer: ");
        tAmount = scan.nextInt();
        try{
            ObjectOutputStream act = new ObjectOutputStream(new FileOutputStream("Accounts"));
            for(int i = 0; i<accounts.size() ; i++){
                if(accounts.get(i).getAccountNumber() == account1){
                    currentAmount = accounts.get(i).getAmount();
                    accounts.get(i).setAmount(currentAmount - tAmount);
                }
                else if(accounts.get(i).getAccountNumber() == account2){
                    currentAmount = accounts.get(i).getAmount();
                    accounts.get(i).setAmount(currentAmount + tAmount);
                }
            }
            for(int i = 0; i<accounts.size() ; i++){
               act.writeObject(accounts.get(i));
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
