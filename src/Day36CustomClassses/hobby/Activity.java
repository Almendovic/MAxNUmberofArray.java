package Day36CustomClassses.hobby;

import java.util.ArrayList;

public class Activity {
    public static void main(String[] args) {

       /* Hobby activity1=new Hobby("Running");
        System.out.println(activity1);


        Hobby activity2=new Hobby("Swimming",20);
        System.out.println(activity2);*/


        Hobby activity3=new Hobby("Jumping",0,true,false);
        System.out.println(activity3);

        Hobby activity4=new Hobby("Golfing",50,true,false);

        Hobby activity5=new Hobby("Video Games",10,false,true);

        Hobby activity6=new Hobby("Basketball",30,false,true);

        ArrayList<Hobby>AllHobbys=new ArrayList<>();
        AllHobbys.add(new Hobby("Jumping",1000,true,false));
        AllHobbys.add(new Hobby("Video games",600,false,true));
        AllHobbys.add(new Hobby("Basketball",30,false,true));






        System.out.println("-----------------------------------");

        ArrayList<Hobby>isIndoor=new ArrayList<>(AllHobbys);
        isIndoor.removeIf(p->p.isOutdoor);

        System.out.println(isIndoor);

        System.out.println("------------------------------------");

        ArrayList<Hobby>Others=new ArrayList<>(AllHobbys);
        Others.removeIf(p->p.requiresOthers);

        System.out.println(Others);

        System.out.println("-----------------------------------");

        ArrayList<Hobby>expensive=new ArrayList<>(AllHobbys);
        expensive.removeIf(p->p.annualCost>500);

        System.out.println(expensive);



    }
}
