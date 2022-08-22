package day33ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HIdePassword {

    public static ArrayList<String> hidePassword(ArrayList<String>list){

        ArrayList<String> hidden=new ArrayList<>();

        for(String each:list){
            String stars="";

            for(int i=0;i<each.length();i++){
                stars+="*";

            }  hidden.add(stars);
        }
        return hidden;








    }

    public static void main(String[] args) {

        ArrayList<String>list =new ArrayList<>(Arrays.asList("one","two","three","monday"));
        System.out.println(hidePassword(list));






    }




    }










