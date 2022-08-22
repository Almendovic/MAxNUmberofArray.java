package Day38GarbageCollectionAccessModifiers.flight;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket1=new FlightTicket("first","Chicago","Virginia");

        System.out.println(ticket1.getType());
        System.out.println(ticket1.getDeparture());
        System.out.println(ticket1.getArrival());


        FlightTicket ticket2=new FlightTicket("flying","Chicago","Virginia");
        System.out.println(ticket2.getType());

        ticket2.setType("economy");
        System.out.println(ticket2.getType());


    }
}
