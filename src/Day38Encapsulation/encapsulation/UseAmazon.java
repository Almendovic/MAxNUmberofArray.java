package Day38Encapsulation.encapsulation;

public class UseAmazon {
    public static void main(String[] args) {



        AmazonAccount account1=new AmazonAccount("Java1","java@gmail.com",true);
        account1.setUserName("Java2");// access Setter

        AmazonAccount account2=new AmazonAccount("Java1","java@gmail.com",true);
        account2.setUserName(account2.getUserName().replace("Java1","Java3"));//access getter
        System.out.println(account1);
        System.out.println(account2);




    }
}
