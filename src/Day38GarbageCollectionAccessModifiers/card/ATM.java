package Day38GarbageCollectionAccessModifiers.card;

public class ATM {

    public static void main(String[] args) {

     DebitCard atm1=new DebitCard(1234567812345678l,"Alen",100000);
        System.out.println(atm1);

        DebitCard atm2=new DebitCard(1234567812345678l,"Gani","Visa",9999,120000);

        System.out.println(atm2);

        atm2.InvalidPin();

        atm2.invalidCardNumber();






    }

}
