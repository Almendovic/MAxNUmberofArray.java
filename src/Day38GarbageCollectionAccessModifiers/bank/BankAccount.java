package Day38GarbageCollectionAccessModifiers.bank;

public class BankAccount {


     private long accountNumber;
     private double balance;

     public BankAccount(long accountNumber, double balance) {
          this.accountNumber = accountNumber;
          this.balance = balance;
     }

     public long getAccountNumber() {
          return accountNumber;
     }

     public double getBalance() {
          return balance;
     }
}
