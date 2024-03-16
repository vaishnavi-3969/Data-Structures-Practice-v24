package Advanced_Java_Programming_LL.Synchronized_Methods;

public class ATM {
    static synchronized void withdraw(BankAccount account, int amount){
        int balance = account.getBalance();
        if(balance-amount < - account.getOverdraft()){
            System.out.println("Transaction denied!");
        }else{
            account.debit(amount);
            System.out.println("Current balance: "+account.getBalance());
        }
    }
}
