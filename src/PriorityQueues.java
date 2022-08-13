import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {

        //Priority Queue = A FIFO data structure that serves elements
        //                with the highest priorities first
        //				  before elements with lower priority


        Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer(3.0);
        priorityQueue.offer(2.5);
        priorityQueue.offer(4.0);
        priorityQueue.offer(1.5);
        priorityQueue.offer(2.0);

//        while (!priorityQueue.isEmpty()){
////            System.out.println(priorityQueue.poll());
//        }

        Queue<String> priorityQueue2 = new PriorityQueue<>();

        priorityQueue2.offer("B");
        priorityQueue2.offer("C");
        priorityQueue2.offer("A");
        priorityQueue2.offer("F");
        priorityQueue2.offer("D");

        while (!priorityQueue2.isEmpty()){
            System.out.println(priorityQueue2.poll());
        }

    }
}
