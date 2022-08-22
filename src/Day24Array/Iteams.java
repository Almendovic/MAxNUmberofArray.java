package Day24Array;

public class Iteams {
    public static void main(String[] args) {


        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        //                  0           ,1           2         3        4            5
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        //                   0      1      2       3      4    5
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};
        //                0        1        2      3       4      5


        for (int i = 0; i < items.length; i++) {
            String item=items[i];
            double price=prices[i];
            int id=itemId[i];

            System.out.println(item+ "-"+ id +"- $"+price);
        }









    }
}
