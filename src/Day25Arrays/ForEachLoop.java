package Day25Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};

/*

        for(int[] each1dArray:arr2d){

            for (int eachElement:each1dArray){
                System.out.print(eachElement+" ");  */




                for(int[]each1DArray:arr2d){
                    for (int eachElement:each1DArray){
                        System.out.print(eachElement+" ");
            }


        }





    }
}
