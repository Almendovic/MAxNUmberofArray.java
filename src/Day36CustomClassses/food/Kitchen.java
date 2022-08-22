package Day36CustomClassses.food;

import java.util.Arrays;

public class Kitchen {
    public static void main(String[] args) {


        Food[] allFood =new Food[5];
        System.out.println(Arrays.toString(allFood));

        Food apples=new Food("apples");
        allFood[0]=apples;// todo storing the Food objects, apples,into the Food array

        allFood[1]=new Food("Sushi",10);
        allFood[2]=new Food("Cajun Pasta",2,3.99);
        allFood[3]=new Food("Kebab",5,2.5);
        allFood[4]=new Food("Plov",4,2.99);
        System.out.println(Arrays.toString(allFood));

        //print each Food object in a separate line

        System.out.println();

        for(Food each:allFood){
            if(each.name.startsWith("A") || each.name.startsWith("C")){
                System.out.println(each);
            }
        }

        System.out.println("Food that is over $9");
        for(Food each:allFood){
            if(each.totalPrice>=9){
                System.out.println(each.name);

                }
            }
        }





    }

