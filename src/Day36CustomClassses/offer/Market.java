package Day36CustomClassses.offer;

import java.util.ArrayList;

public class Market {
    public static void main(String[] args) {


        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(new Offer("Amazon", "San Diego", 120_000, true, 15));
        allOffers.add(new Offer("Chase", "Chicago", 125_000, true, 15));
        allOffers.add(new Offer("Google", "Seattle", 170_000, false, 0));
        allOffers.add(new Offer("Accenture", "Chicago", 110_000, false, 5));
        allOffers.add(new Offer("Walmart", "Chicago", 125_000, false, 0));
        allOffers.add(new Offer("Meta", "Seattle", 135_000, true, 12));
        allOffers.add(new Offer("Deloitte", "Seattle", 135_000, true, 12));

        //write a program that can only keep the offers from local area
        ArrayList<Offer> localOffers = new ArrayList<>(allOffers);
        localOffers.removeIf(offer -> !offer.location.equals("Chicago"));
        System.out.println(localOffers);

//        // alternative, manually
//        for(Offer each : allOffers){
//            if(each.location.equals("Chicago")){
//                System.out.println(each);
//            }
//        }

        //write a program that can remove the offers that are not full Time
        System.out.println();
        ArrayList<Offer> onlyFullTime = new ArrayList<>(allOffers);
        onlyFullTime.removeIf(p -> !p.isFullTime);
        System.out.println(onlyFullTime);
//        onlyFullTime.forEach(each -> System.out.println(each));

        System.out.println();


        ArrayList<Offer>minSalary =new ArrayList<>(allOffers);
        minSalary.removeIf(p->p.salary<130_000);//todo p represents every object offer in the List
        System.out.println(minSalary);


        double min= allOffers.get(0).salary;
        double max=allOffers.get(0).salary;

        for(Offer each:allOffers){
            if(each.salary>max){
                max=each.salary;
            }

            if(each.salary<min){
                min=each.salary;
            }



        }System.out.println("Max Salary offered: "+max);
        System.out.println("Min Salary offered: "+ min);
    }

}









