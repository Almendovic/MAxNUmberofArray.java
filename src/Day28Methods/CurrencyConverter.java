package Day28Methods;

public class CurrencyConverter {
    /*
    Currency Converter

create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method

Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5
     */


    public static void main(String[] args) {
        String amountConvert=convert("dollar",5);


    }
    public static String convert (String currency, double amount){

        if(currency.equals("dollar")) {
            double euro= amount * 0.91;
            double yen = amount*121.03;
            double lira = amount*14.85;
            double won = amount*1_217.52;
            double rupee = amount*181.45;
            System.out.println(euro +" euros");
            System.out.println(yen + " yen");
            System.out.println(lira + " lira");
            System.out.println(won+ " won");
            System.out.println(rupee + " rupee");
        }


        return currency;
    }



}
