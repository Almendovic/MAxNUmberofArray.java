package day34CostumClasses.School;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder,long accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;



    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }


    public void deposit(double amount){
        if(amount<0){
            System.out.println("Depositing amount can not be zero or negative");
            return;// todo exists the method if amount is negative
        }

        balance+=amount;
    }


    public void withdraw(double amount){ //todo if withdrawing amount is greater thn available balance
        if(amount>balance){
            System.out.println("Insuffient balance");
            return;
        }
          if(amount<=0){
              System.out.println("withdrawing amount can not be negative or zero");
              return;
          }
        balance-=amount;
    }
}
