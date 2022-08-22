package Day24Array;

public class SchoolStore {
    public static void main(String[] args) {

        // each item price and id are related in the positions

        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};


        // print the catalog
        System.out.println("Full Catalog\n\tID\t | Name | Price");// put outside the loop
        for (int i = 0; i < items.length; i++) {


            System.out.println(itemId[i] + " |" + items[i] + " | $" + prices[i]); // [i] allowed to print in order


            // FINDING IF JACKETS IN THE STORE
            boolean inStock = false;
            for (String eachItem : items) { // eachItem will represent each element from the Array items
                if (eachItem.equalsIgnoreCase("jacket")) {
                    inStock = true;
                    break;
                }


            }
            System.out.println(inStock ? "Jacket is in stock" : "we dont have jackets right now");


            System.out.println();

            // find the index of notebook
            int index = -1;// next logic
            for (int i1 = 0; i1 < items.length; i1++) {
                  if(items[i1].equalsIgnoreCase("notebook")){
                      index=i1;
                  }
            }
            System.out.println("Index of notebook: "+index);


            System.out.println();
            // Find the information for the most expensive item
             double maxPrice= prices[0]; // first index of prices int
             int indexofMax=0;

            for (int i1 = 0; i1 < prices.length; i1++) {// we can start from int -1 because the first price is already the default

                 if(prices[i1] > maxPrice){
                     maxPrice=prices[i1];
                     indexofMax=i1;
                 }
            }
            System.out.println("Most expensive item: "+ itemId[indexofMax]+ "|"+items[indexofMax]+"| $"+prices[indexofMax]);



        }








    }
}
