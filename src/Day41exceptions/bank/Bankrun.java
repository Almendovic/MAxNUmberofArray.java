package Day41exceptions.bank;

public class Bankrun {
    public static void main(String[] args) {



        Bank obj=new Bank();
        obj.balance=3000;

        obj.withdraw(2000);
        System.out.println(obj.balance);

        obj.withdraw(2000);


    }
}
