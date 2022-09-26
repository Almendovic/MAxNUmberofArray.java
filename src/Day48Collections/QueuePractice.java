package Day48Collections;

import java.util.*;


public class QueuePractice {
    public static void main(String[] args) {



        Queue<Integer> priorityQueue= new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("priorityQueue" + priorityQueue);

        System.out.println("-----------------------------------");


        Queue<Integer> arrayQueue= new ArrayDeque<>();
       arrayQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayQueue "+arrayQueue);
        System.out.println("-----------------------------------");



        Queue<Integer> linkedlist= new LinkedList<>();
       linkedlist.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedlist " + linkedlist);
        System.out.println("-----------------------------------");


        priorityQueue.poll();

        System.out.println("priorityQueue" + priorityQueue);

        arrayQueue.poll();
        System.out.println("arrayQueue "+arrayQueue);

        linkedlist.poll();
        System.out.println("linkedlist " + linkedlist);

        System.out.println("------------------------------------");

        //        System.out.println(priorityQueue.get(1));
//        System.out.println(arrayDeque.get(1));
//        System.out.println(linkedList.get(1)); don't have an index number







    }
}
