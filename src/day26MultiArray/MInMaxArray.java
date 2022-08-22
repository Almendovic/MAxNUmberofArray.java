package day26MultiArray;

public class MInMaxArray {
    public static void main(String[] args) {

        /* Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12


         */

        int[][] array = {{1, 5, -100}, {-13, 41, -5}, {100, 5, 1, 5}};
        int max=0;
        int min=0;

        for (int[] elements : array) {
            for (int each:elements){
                if(each>max)
                    max=each;

                if(each<min)
                    min=each;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);






    }
}
