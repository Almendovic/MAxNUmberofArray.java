package Day30_practice_wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {


        String str="123";

        int num= Integer.parseInt(str);//int
        System.out.println(num+5);//124
        System.out.println(str+1);//1231



        String str2="10.5";

        double num2=Double.parseDouble(str2);
        System.out.println(num2+10);

        int s= Integer.MAX_VALUE;
        int d=Integer.MIN_VALUE;
        System.out.println(s);
        System.out.println(d);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;

        System.out.println(max2);
        System.out.println(min2);


        String s1="";

        boolean s2=Boolean.parseBoolean(s1);

        System.out.println(s2);
        System.out.println("--------------------------");

        String s4 ="1234";
        Integer x= Integer.valueOf(s4);
        int y= Integer.valueOf(s4);
        System.out.println(s4);
        System.out.println(x);

        System.out.println("-------------------------------");

        char ch1='0';

        boolean r2=Character.isDigit(ch1) ;

        System.out.println(r2);

        System.out.println("--------------------------------");

        int sum=0;

        String str22="ab1cde2efg3hi4";

        int sum22=0;
        for(char each:str22.toCharArray()){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println("sum= "+sum);




    }
}
